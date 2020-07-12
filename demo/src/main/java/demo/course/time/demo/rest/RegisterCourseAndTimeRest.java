package demo.course.time.demo.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.course.time.demo.domain.Time;
import demo.course.time.demo.repo.CourseRepo;
import demo.course.time.demo.repo.TimeRepo;

@RestController
@RequestMapping(value = "/api/register")
public class RegisterCourseAndTimeRest {

    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private TimeRepo timeRepo;

    // case to json stack overflow fix by @Jsonignore or customView
    @GetMapping("/find-all")
    public ResponseEntity<?> findAll() {

        try {
            return ResponseEntity.ok().body(this.timeRepo.findAll());

        } catch (Exception e) {
            return ResponseEntity.status(420).body("not search ! " + e.getMessage());

        }

    }

    @PostMapping("/delete-time")
    public void deleteTimeInCourseById() throws Exception {
        try {
            Integer fixId = 7;
            Optional<Time> t1 = timeRepo.findById(fixId);

            if(t1.isPresent()){
                timeRepo.deleteById(fixId);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }

}