package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentsService {
    @Value("${jsonplaceholder.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public CommentsService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Comment> getAllComments() {
        String url = baseUrl + "/comments";
        Comment[] commentsArray = restTemplate.getForObject(url, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}

