package com.course.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.course.entity.CartEntity;
import com.course.entity.CourseEntity;
import com.course.repository.CartRepository;
import com.course.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private CartRepository cartRepo;

    public List<CourseEntity> getAllCourses() {
        return courseRepo.findAll();
    }

    public List<CourseEntity> searchByAuthor(String author) {
        return courseRepo.findByAuthorNameContainingIgnoreCase(author);
    }

    public List<CourseEntity> searchByName(String name) {
        return courseRepo.findByCourseNameContainingIgnoreCase(name);
    }

    public void addToCart(CartEntity cart) {
        cartRepo.save(cart);
    }

    public void deleteFromCart(int id) {
        cartRepo.deleteById(id);
    }
}

