package com.easybites.backend.CourseContent.repository;

import com.easybites.backend.CourseContent.model.CourseContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContent, Integer> {
    List<CourseContent> findAllByCourseName(String courseName);
}
