package ufal.ace3comunicaufal.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tag {
    
    @Id
	@GeneratedValue
	private Integer id;

	@OneToOne
	private Course course;

	private String name;
    private String email;
    private String password;

	public Tag() {}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}
    public void setCourse(Course course) {
		this.course = course;
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

}
