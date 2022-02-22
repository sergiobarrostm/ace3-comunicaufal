package ufal.ace3comunicaufal.models;

import javax.persistence.Entity;


@Entity
public class Staff extends Person {

	public Staff(){}

	public Staff(Integer matricula, String name, String email, String password, Course course) {
		super(matricula, name, email, password, course);
	}

}