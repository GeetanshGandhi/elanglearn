package com.easybites.backend.CourseContent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contentId;

    private String courseName;
    private String contentTitle;
    private String contentLink;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentLink() {
        return contentLink;
    }

    public void setContentLink(String contentLink) {
        this.contentLink = contentLink;
    }

    @Override
    public String toString() {
        return "{" +
                "\"contentId\":" + contentId +
                ", \"courseName\":\"" + courseName + '\"' +
                ", \"contentTitle\":\"" + contentTitle + '\"' +
                ", \"contentLink\":\"" + contentLink + '\"' +
                '}';
    }
}
