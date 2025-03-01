package com.s19.twitterBackend.service.impl;

import com.s19.twitterBackend.model.Tweet;
import com.s19.twitterBackend.repository.TweetRepository;
import com.s19.twitterBackend.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public Tweet saveTweet(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    @Override
    public Tweet getTweetById(Long id) {
        return tweetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tweet> getTweetsByUserId(Long userId) {
        return tweetRepository.findByUserId(userId);
    }

    @Override
    public Tweet updateTweet(Long id, Tweet tweet) {
        Tweet existingTweet = tweetRepository.findById(id).orElse(null);
        if (existingTweet != null) {
            existingTweet.setContent(tweet.getContent());
            return tweetRepository.save(existingTweet);
        }
        return null;
    }

    @Override
    public void deleteTweet(Long id) {
        tweetRepository.deleteById(id);
    }
}