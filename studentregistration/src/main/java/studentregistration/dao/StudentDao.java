package studentregistration.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import studentregistration.model.Student;


@Component
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createStudent(Student student) {
		this.hibernateTemplate.saveOrUpdate(student);
	}
	
	//get all students
	public List<Student> getStudents(){
		List<Student> students= this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//delete a single student
	@Transactional
	public void deleteStudent(int sid) {
		Student student = this.hibernateTemplate.load(Student.class,sid);
		this.hibernateTemplate.delete(student);
	}
	
	//get a single customer
	public Student getStudent(int sid) {
		return this.hibernateTemplate.get(Student.class,sid);
	}
}
