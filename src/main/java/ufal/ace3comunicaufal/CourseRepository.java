package ufal.ace3comunicaufal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ufal.ace3comunicaufal.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
}
