package ufal.ace3comunicaufal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ufal.ace3comunicaufal.RequestRepository;
import ufal.ace3comunicaufal.StaffRepository;
import ufal.ace3comunicaufal.StudentRepository;
import ufal.ace3comunicaufal.models.Course;
import ufal.ace3comunicaufal.models.Request;
import ufal.ace3comunicaufal.models.Student;

@Controller
public class DashboardController {
	
	private StudentRepository studentRepository;
	private RequestRepository requestRepository;
	private StaffRepository staffRepository;

	public DashboardController(StudentRepository studentRepository, RequestRepository requestRepository, StaffRepository staffRepository) {
		this.studentRepository = studentRepository;
		this.requestRepository = requestRepository;
		this.staffRepository = staffRepository;
	}


	@GetMapping("/dashboard")
	public String dashboardScreen(Integer id, Model model) {

		if(studentRepository.findById(id).isPresent()){
			Student student =studentRepository.findById(id).get() ;
			Iterable<Request> requests = requestRepository.findByStudent(student);
			model.addAttribute("student", student);
			model.addAttribute("requests", requests);
			return "dashboard-student";
		}

		if(staffRepository.findById(id).isPresent()){
			Course course = staffRepository.findById(id).get().getCourse();
			Iterable<Request> requests = requestRepository.findByCourse(course);
			model.addAttribute("requests" , requests);
			return "dashboard-coordenacao";
		}

		return "error-page";
		
	}
	
}
