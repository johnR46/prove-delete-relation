package demo.course.time.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.course.time.demo.domain.Time;

public interface TimeRepo extends JpaRepository<Time,Integer>{
    
}