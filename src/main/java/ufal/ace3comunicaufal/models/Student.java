package ufal.ace3comunicaufal.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
    private int matricula;
	
    private int quarter;
    private String name, surname, email, course;
    
    @OneToMany
    private List<Request> requests;
    
    public Student() { }


    public int getMatricula() {
        return matricula;
    }

    public int getQuarter() {
        return quarter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public void setMatricula (int matricula ) {
        this.matricula = matricula;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	} 

}
