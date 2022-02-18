package ufal.ace3comunicaufal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ufal.ace3comunicaufal.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
