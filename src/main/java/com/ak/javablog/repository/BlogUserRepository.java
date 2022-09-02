package com.ak.javablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.javablog.model.BlogUser;

@Repository
public interface BlogUserRepository extends JpaRepository<BlogUser, Long> {

}