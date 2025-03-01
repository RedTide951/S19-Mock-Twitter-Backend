package com.s19.twitterBackend.repository;

import com.s19.twitterBackend.model.Retweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetweetRepository extends JpaRepository<Retweet, Long> {
}