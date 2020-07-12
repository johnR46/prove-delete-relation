package demo.course.time.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.course.time.demo.domain.Course;
import demo.course.time.demo.repo.CourseRepo;
import demo.course.time.demo.repo.TimeRepo;

@SpringBootApplication
public class DemoApplication {


	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

}
