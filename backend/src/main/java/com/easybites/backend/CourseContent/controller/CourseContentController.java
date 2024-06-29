package com.easybites.backend.CourseContent.controller;

import com.easybites.backend.CourseContent.model.CourseContent;
import com.easybites.backend.CourseContent.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/content")
public class CourseContentController {
    @Autowired
    ContentService contentService;

    @PostMapping("/saveAll")
    public String addAllContent(@RequestBody List<CourseContent> ip){
        return contentService.addAll(ip);
    }

    @PostMapping("/getByCourse")
    public List<CourseContent> getContentByCourse(@RequestBody String course){
        return contentService.getContentByCourse(course);
    }
}
