package ufal.ace3comunicaufal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ufal.ace3comunicaufal.models.Request;
import ufal.ace3comunicaufal.models.Student;

@Repository
public interface RequestRepository extends CrudRepository<Request, Integer>{
	Iterable<Request> findByStudent(Student sudent);
}
