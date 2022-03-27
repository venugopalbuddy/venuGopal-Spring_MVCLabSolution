package studentregistration.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


import studentregistration.model.Student;
import studentregistration.service.StudentService;

@Controller
public class MainController {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Student> students= studentservice.getStudents();
		m.addAttribute("students", students);
		return "index";
	}
	
	@RequestMapping("/add-student")
	public String addStudent(Model m) {
		m.addAttribute("title","Add Student");
		return "add_student_form";
	}
	@RequestMapping(value="/handle-student", method = RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Student student,HttpServletRequest request) {
		System.out.println(student);
		studentservice.createStudent(student);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{studentID}")
	public RedirectView deleteStudent(@PathVariable ("studentID") int studentID,HttpServletRequest request) {
		this.studentservice.deleteStudent(studentID); 
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	@RequestMapping("/update/{studentId}")
	public String updateForm(@PathVariable("studentId") int sid,Model model)
	{
		Student student = this.studentservice.getStudent(sid);
		model.addAttribute("student",student);
		return "update_form";
	}
}
