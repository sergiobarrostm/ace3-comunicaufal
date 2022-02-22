package ufal.ace3comunicaufal.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person{

    
    @OneToMany
    private List<Request> requests;

	public Student(){}
    
	public Student(Integer matricula, String name, String email, String password, Course course) {
		super(matricula, name, email, password, course);
	}


	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	} 


}
