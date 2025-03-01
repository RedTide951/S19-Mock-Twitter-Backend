package com.s19.twitterBackend.controller;

import com.s19.twitterBackend.model.Tweet;
import com.s19.twitterBackend.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @PostMapping
    public ResponseEntity<Tweet> createTweet(@RequestBody Tweet tweet) {
        return ResponseEntity.ok(tweetService.saveTweet(tweet));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tweet> getTweetById(@PathVariable Long id) {
        return ResponseEntity.ok(tweetService.getTweetById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Tweet>> getTweetsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(tweetService.getTweetsByUserId(userId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tweet> updateTweet(@PathVariable Long id, @RequestBody Tweet tweet) {
        return ResponseEntity.ok(tweetService.updateTweet(id, tweet));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTweet(@PathVariable Long id) {
        tweetService.deleteTweet(id);
        return ResponseEntity.noContent().build();
    }
}