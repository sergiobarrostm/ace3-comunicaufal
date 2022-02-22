package ufal.ace3comunicaufal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ufal.ace3comunicaufal.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    
}
