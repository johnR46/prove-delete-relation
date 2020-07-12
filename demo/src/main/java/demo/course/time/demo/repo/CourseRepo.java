package demo.course.time.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.course.time.demo.domain.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}