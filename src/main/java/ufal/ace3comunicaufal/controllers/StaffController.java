package ufal.ace3comunicaufal.controllers;

import org.springframework.stereotype.Controller;

import ufal.ace3comunicaufal.StaffRepository;
import ufal.ace3comunicaufal.models.Staff;

@Controller
public class StaffController {

    private StaffRepository staffRepository;
    
    public StaffController(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}

    public void createStaff(Staff staff){
        staffRepository.save(staff);
    }
}
