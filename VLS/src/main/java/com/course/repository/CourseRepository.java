package com.course.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.course.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
    List<CourseEntity> findByAuthorNameContainingIgnoreCase(String authorName);
    List<CourseEntity> findByCourseNameContainingIgnoreCase(String courseName);
}

