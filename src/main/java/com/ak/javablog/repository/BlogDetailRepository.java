package com.ak.javablog.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.javablog.model.BlogDetail;

@Repository
public interface BlogDetailRepository extends JpaRepository<BlogDetail, Long> {

	List<BlogDetail> findByUserId(Long blogUserId);
	
}