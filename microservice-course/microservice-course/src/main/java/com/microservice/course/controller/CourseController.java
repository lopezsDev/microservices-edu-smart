package com.microservice.course.controller;

import com.microservice.course.entity.Course;
import com.microservice.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAllCourse() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Course> getCourseById(@RequestParam Long id) {
        try {
            Course course = courseService.findById(id);
            return new ResponseEntity<>(course, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCourse(@RequestBody Course course) {
        courseService.save(course);
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse) {
        return new ResponseEntity<>(courseService.findByStudentByIdCourse(idCourse), HttpStatus.OK);
    }
}
