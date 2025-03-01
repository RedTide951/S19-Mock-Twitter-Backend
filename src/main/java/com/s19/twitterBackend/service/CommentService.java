package com.s19.twitterBackend.service;

import com.s19.twitterBackend.model.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    Comment getCommentById(Long id);
    List<Comment> getCommentsByTweetId(Long tweetId);
    Comment updateComment(Long id, Comment comment);
    void deleteComment(Long id);
}