package studentregistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentid;
	private String name;
	private String department;
	private String country;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", department=" + department + ", country="
				+ country + "]";
	}
	
	

	
	
}
