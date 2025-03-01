package com.s19.twitterBackend.controller;

import com.s19.twitterBackend.model.Retweet;
import com.s19.twitterBackend.service.RetweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/retweets")
public class RetweetController {

    @Autowired
    private RetweetService retweetService;

    @PostMapping
    public ResponseEntity<Retweet> createRetweet(@RequestBody Retweet retweet) {
        return ResponseEntity.ok(retweetService.saveRetweet(retweet));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRetweet(@PathVariable Long id) {
        retweetService.deleteRetweet(id);
        return ResponseEntity.noContent().build();
    }
}