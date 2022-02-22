package ufal.ace3comunicaufal.controllers;

import org.springframework.stereotype.Controller;

import ufal.ace3comunicaufal.CourseRepository;
import ufal.ace3comunicaufal.models.Course;

@Controller
public class CourseController {
   
    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

    public void createCourse(Course course){
        courseRepository.save(course);
    }
    
}
