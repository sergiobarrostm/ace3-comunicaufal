package ufal.ace3comunicaufal.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
    
    @Id
	@GeneratedValue
	private Integer id;

	private String name;

	public Tag() {}

	public Integer getId() {
		return id;
	}

    public String getName(){
        return name;
    }

    public void setName(String tag_usada){
        this.name = tag_usada;
    }
	

}
