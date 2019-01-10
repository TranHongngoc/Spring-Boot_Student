package com.codegym.student;

import com.codegym.student.service.StudentService;
import com.codegym.student.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean
	public StudentService studentService(){
		return new StudentServiceImpl();
	}

}

