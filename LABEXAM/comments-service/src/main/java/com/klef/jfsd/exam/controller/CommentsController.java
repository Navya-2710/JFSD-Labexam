package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Comment;
import com.klef.jfsd.exam.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping
    public List<Comment> fetchAllComments() {
        return commentsService.getAllComments();
    }
}
