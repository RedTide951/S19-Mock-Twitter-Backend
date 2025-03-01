package com.s19.twitterBackend.service;

import com.s19.twitterBackend.model.Like;

public interface LikeService {
    Like saveLike(Like like);
    void deleteLike(Long id);
}