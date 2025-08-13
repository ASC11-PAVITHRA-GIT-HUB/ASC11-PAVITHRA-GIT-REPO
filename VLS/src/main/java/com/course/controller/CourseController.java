package com.course.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.entity.CartEntity;
import com.course.entity.CourseEntity;
import com.course.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @PostMapping("/add")
    public String addCourse(@RequestBody CourseEntity course) {
        courseService.addCourse(course);
        return "Course added successfully";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
        return "Course deleted successfully";
    }



    @GetMapping("/all")
    public List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/search/author/{author}")
    public List<CourseEntity> searchByAuthor(@PathVariable String author) {
        return courseService.searchByAuthor(author);
    }

    @GetMapping("/search/name/{name}")
    public List<CourseEntity> searchByName(@PathVariable String name) {
        return courseService.searchByName(name);
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestBody CartEntity cart) {
        courseService.addToCart(cart);
        return "Course added to cart";
    }

    @DeleteMapping("/cart/delete/{id}")
    public String deleteFromCart(@PathVariable int id) {
        courseService.deleteFromCart(id);
        return "Course removed from cart";
    }
}

