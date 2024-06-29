package com.easybites.backend.Submission.controller;

import com.easybites.backend.Submission.model.Submission;
import com.easybites.backend.Submission.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/submission")
public class SubmissionController {
    @Autowired
    SubmissionService submissionService;

    @PostMapping("/saveSubmission")
    public String saveSubmission(@RequestBody Submission submission){
        return submissionService.saveSubmission(submission);
    }

    @PostMapping("/getProgress")
    public int getProgress(@RequestBody List<String> detail){
        return submissionService.getProgress(detail.get(0), detail.get(1));
    }

    @PostMapping("/getByUser")
    public List<Submission> getSubByUser(@RequestBody String email){
        return submissionService.getSubByEmail(email);
    }
}
