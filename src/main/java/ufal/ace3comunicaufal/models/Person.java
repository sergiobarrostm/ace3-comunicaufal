package ufal.ace3comunicaufal.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Person {

    @Id
    private Integer matricula;
	
    private String name, surname;

    private String email;

	private String password;

    @ManyToOne
	protected Course course;
    
    public Person() {}
    
    public Person(Integer matricula, String name, String email, String password, Course course) {
		this.matricula = matricula;
		this.name = name;
		this.email = email;
		this.password = password;
		this.course = course;
    }

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
    
    
    
}
