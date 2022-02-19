package ufal.ace3comunicaufal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ufal.ace3comunicaufal.StudentRepository;
import ufal.ace3comunicaufal.models.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {
	
	private StudentRepository studentRepository;	

	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping("/")
	public String index() {
		return "sign-in";
	}
	
	@GetMapping("/signup")
	public String signUpScreen(Model model) {
		Student student = new Student();
        model.addAttribute("student" , student);
		return "sign-up";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute Student student) {
		studentRepository.save(student);
        return "success-sign-up";
	}
	
}
