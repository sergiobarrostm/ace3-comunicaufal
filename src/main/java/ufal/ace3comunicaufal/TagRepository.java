package ufal.ace3comunicaufal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ufal.ace3comunicaufal.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {

}
