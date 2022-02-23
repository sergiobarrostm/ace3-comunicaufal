package ufal.ace3comunicaufal.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ufal.ace3comunicaufal.RequestRepository;
import ufal.ace3comunicaufal.StudentRepository;
import ufal.ace3comunicaufal.TagRepository;
import ufal.ace3comunicaufal.models.Request;
import ufal.ace3comunicaufal.models.Student;
import ufal.ace3comunicaufal.models.Tag;

@Controller
public class RequestController {
	
	private RequestRepository requestRepository;
	private StudentRepository studentRepository;
	private TagRepository tagRepository;


	public RequestController(RequestRepository requestRepository, StudentRepository studentRepository, TagRepository tagRepository) {
		this.requestRepository = requestRepository;
		this.studentRepository = studentRepository;
		this.tagRepository = tagRepository;
	}

	@GetMapping("/request")
	public String signUpScreen(Integer id, String password, Model model) {
		Request request = new Request();
		Integer matricula = id;
		Iterable<Tag> tags = tagRepository.findAll();
		model.addAttribute("tags" ,tags);
        model.addAttribute("request" , request);
        model.addAttribute("matricula" , matricula);
		model.addAttribute("password" , password);
		return "new-solicitation";
	}
	
	@PostMapping("/request/create")
	public String create(Integer id, String password, @ModelAttribute Request request, Model model) {
		Student student = studentRepository.findById(id).get();
		Date requestNow = new Date();
		request.setCourse(student.getCourse());
        request.setStudent(student);
        request.setRequestDate(requestNow);  
		requestRepository.save(request);
		model.addAttribute("password" , password);
        model.addAttribute("id", id);
        return "success-request-student";
	}
	
	@GetMapping("request/details")
	public String requestDetails(Integer id, Model model) {
		Request request = requestRepository.findById(id).get();
		model.addAttribute(request);
		return "request-details";
	}
	
}
