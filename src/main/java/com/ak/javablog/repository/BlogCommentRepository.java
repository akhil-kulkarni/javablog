package com.ak.javablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.javablog.model.BlogComment;

@Repository
public interface BlogCommentRepository extends JpaRepository<BlogComment, Long> {

}