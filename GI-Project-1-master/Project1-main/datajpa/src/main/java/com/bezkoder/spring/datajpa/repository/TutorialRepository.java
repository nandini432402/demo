package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    // Custom query method to find by published status
    List<Tutorial> findByPublished(boolean published);

    // Custom query method to search title with partial match
    List<Tutorial> findByTitleContaining(String title);
}
