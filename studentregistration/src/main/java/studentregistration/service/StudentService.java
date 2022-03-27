package studentregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentregistration.dao.StudentDao;
import studentregistration.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentdao;
	
	
	public void createStudent(Student student) {
		studentdao.createStudent(student);
	}
	
	public List<Student> getStudents(){
		List<Student> students= studentdao.getStudents();
		return students;
	}
	
	public void deleteStudent(int sid) {
	studentdao.deleteStudent(sid);
	}
	
	public Student getStudent(int sid) {
		Student s=studentdao.getStudent(sid);
		return s;
	}
}

