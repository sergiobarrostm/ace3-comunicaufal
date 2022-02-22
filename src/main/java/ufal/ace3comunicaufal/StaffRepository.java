package ufal.ace3comunicaufal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ufal.ace3comunicaufal.models.Staff;

@Repository
public interface StaffRepository extends  CrudRepository<Staff, Integer>{
    
}
