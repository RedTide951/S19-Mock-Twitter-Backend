package com.s19.twitterBackend.service;

import com.s19.twitterBackend.model.Retweet;

public interface RetweetService {
    Retweet saveRetweet(Retweet retweet);
    void deleteRetweet(Long id);
}