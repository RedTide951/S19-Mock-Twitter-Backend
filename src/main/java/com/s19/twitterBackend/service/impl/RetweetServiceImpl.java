package com.s19.twitterBackend.service.impl;

import com.s19.twitterBackend.model.Retweet;
import com.s19.twitterBackend.repository.RetweetRepository;
import com.s19.twitterBackend.service.RetweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetweetServiceImpl implements RetweetService {

    @Autowired
    private RetweetRepository retweetRepository;

    @Override
    public Retweet saveRetweet(Retweet retweet) {
        return retweetRepository.save(retweet);
    }

    @Override
    public void deleteRetweet(Long id) {
        retweetRepository.deleteById(id);
    }
}