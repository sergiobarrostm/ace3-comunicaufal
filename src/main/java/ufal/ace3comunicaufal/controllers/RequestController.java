package ufal.ace3comunicaufal.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ufal.ace3comunicaufal.RequestRepository;
import ufal.ace3comunicaufal.StudentRepository;
import ufal.ace3comunicaufal.models.Request;
import ufal.ace3comunicaufal.models.Student;

@Controller
public class RequestController {
	
	private RequestRepository requestRepository;
	private StudentRepository studentRepository;


	public RequestController(RequestRepository requestRepository, StudentRepository studentRepository) {
		this.requestRepository = requestRepository;
		this.studentRepository = studentRepository;
	}

	@GetMapping("/request")
	public String signUpScreen(Integer id, Model model) {
		Request request = new Request();
		Integer matricula = id;
        model.addAttribute("request" , request);
        model.addAttribute("matricula", matricula);
		return "new-solicitation";
	}
	
	@PostMapping("/request/create")
	public String create(Integer id, @ModelAttribute Request request, Model model) {
		Student student = studentRepository.findById(id).get();
		Date requestNow = new Date();
        request.setStudent(student);
        request.setRequestDate(requestNow);
		requestRepository.save(request);
        model.addAttribute("id", id);
        return "success-request-student";
	}
	
	
}
