package ufal.ace3comunicaufal;

import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ufal.ace3comunicaufal.controllers.StaffController;
import ufal.ace3comunicaufal.models.Course;
import ufal.ace3comunicaufal.models.Staff;
import ufal.ace3comunicaufal.models.Tag;

@SpringBootApplication
public class Ace3ComunicaufalApplication {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		ConfigurableApplicationContext configurableApplicationContext =  
		SpringApplication.run(Ace3ComunicaufalApplication.class, args);

		CourseRepository courseRepository = 
		configurableApplicationContext.getBean(CourseRepository.class);

		TagRepository tagRepository =
		configurableApplicationContext.getBean(TagRepository.class);

		StaffController staffController =
		configurableApplicationContext.getBean(StaffController.class);

		Course computacao = new Course("Ciência da Computação");
		Course arquitetura = new Course("Arquitetura");
		Course enfermagem = new Course("Enfermagem");
		Course medicina = new Course("Medicina");
		
		Staff coordComputacao = new Staff(101 , "Raquel", "raquel@email.com", "12345", computacao);

		Tag trancamento = new Tag("Trancamento de Matrícula");
		Tag destrancamento = new Tag("Destrancamento de Matrícula");
		Tag reclamacao = new Tag("Reclamação");


		courseRepository.save(computacao);
		courseRepository.save(arquitetura);
		courseRepository.save(enfermagem);
		courseRepository.save(medicina);

		staffController.createStaff(coordComputacao);

		tagRepository.save(trancamento);
		tagRepository.save(destrancamento);
		tagRepository.save(reclamacao);

	}

}
