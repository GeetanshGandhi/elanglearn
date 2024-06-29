package com.easybites.backend.CourseContent.service;

import com.easybites.backend.CourseContent.model.CourseContent;
import com.easybites.backend.CourseContent.repository.CourseContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    @Autowired
    CourseContentRepository courseContentRepository;

    public String addAll(List<CourseContent> contents){
        courseContentRepository.saveAll(contents);
        return "success";
    }
    public List<CourseContent> getContentByCourse(String course){
        return courseContentRepository.findAllByCourseName(course);
    }
}
