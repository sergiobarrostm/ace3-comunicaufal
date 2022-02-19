package ufal.ace3comunicaufal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ufal.ace3comunicaufal.RequestRepository;
import ufal.ace3comunicaufal.StudentRepository;
import ufal.ace3comunicaufal.models.Request;
import ufal.ace3comunicaufal.models.Student;

@Controller
public class DashboardController {
	
	private StudentRepository studentRepository;
	private RequestRepository requestRepository;
	

	public DashboardController(StudentRepository studentRepository, RequestRepository requestRepository) {
		this.studentRepository = studentRepository;
		this.requestRepository = requestRepository;
	}
	
	@GetMapping("/dashboard")
	public String dashboardStudentScreen(Integer id, Model model) {
        Student student = studentRepository.findById(id).get();
        Iterable<Request> requests = requestRepository.findByStudent(student);
        model.addAttribute("student", student);
        model.addAttribute("requests", requests);
        return "dashboard-student";	
    }
	


}
