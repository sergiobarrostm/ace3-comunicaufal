package ufal.ace3comunicaufal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ufal.ace3comunicaufal.RequestRepository;
import ufal.ace3comunicaufal.StudentRepository;
import ufal.ace3comunicaufal.models.Request;
import ufal.ace3comunicaufal.models.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {
	
	private StudentRepository studentRepository;
	private RequestRepository requestRepository;
	

	public StudentController(StudentRepository studentRepository, RequestRepository requestRepository) {
		this.studentRepository = studentRepository;
		this.requestRepository = requestRepository;
	}

	@GetMapping("/")
	public String index() {
		return "sign-in";
	}
	
	@GetMapping("/dashboard")
	public String dashboardStudentScreen(Integer id, Model model) {
        Student student = studentRepository.findById(id).get();
        Iterable<Request> requests = requestRepository.findByStudent(student);
        model.addAttribute("student", student);
        model.addAttribute("requests", requests);
        return "dashboard-student";	
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