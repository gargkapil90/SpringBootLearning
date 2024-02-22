package com.example.k4kapilgarg.learnspringboot.Course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getCourses(){
        return Arrays.asList(
                new Course(1, "DSA", "Scaler"),
                        new Course(1, "LLD", "Scaler - 2")

        );
    }
}
