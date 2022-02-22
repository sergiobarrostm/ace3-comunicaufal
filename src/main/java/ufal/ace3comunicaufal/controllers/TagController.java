package ufal.ace3comunicaufal.controllers;

import org.springframework.stereotype.Controller;

import ufal.ace3comunicaufal.TagRepository;
import ufal.ace3comunicaufal.models.Tag;

@Controller
public class TagController {
    private TagRepository tagRepository;

    public TagController(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}

    public void createTag(Tag tag){
        tagRepository.save(tag);
    }
}
