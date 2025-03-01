package com.s19.twitterBackend.service.impl;

import com.s19.twitterBackend.model.Like;
import com.s19.twitterBackend.repository.LikeRepository;
import com.s19.twitterBackend.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeRepository likeRepository;

    @Override
    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }

    @Override
    public void deleteLike(Long id) {
        likeRepository.deleteById(id);
    }
}