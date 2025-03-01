package com.s19.twitterBackend.service;

import com.s19.twitterBackend.model.Tweet;

import java.util.List;

public interface TweetService {
    Tweet saveTweet(Tweet tweet);
    Tweet getTweetById(Long id);
    List<Tweet> getTweetsByUserId(Long userId);
    Tweet updateTweet(Long id, Tweet tweet);
    void deleteTweet(Long id);
}