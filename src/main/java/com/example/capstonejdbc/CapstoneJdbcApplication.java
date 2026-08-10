package com.example.capstonejdbc;

import com.example.capstonejdbc.contoller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapstoneJdbcApplication {

	public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.start();
	}

}
