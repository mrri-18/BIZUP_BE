package com.likelion.bizup.module.community.repository;

import com.likelion.bizup.module.community.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Long> {
    List<Community> findAllByOrderByCreatedAtDesc();
    List<Community> findAllByOrderByLikeCountDesc();
}
