package com.ak.javablog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.javablog.model.BlogDetail;
import com.ak.javablog.repository.BlogDetailRepository;

@Service
public class BlogDetailService {
	@Autowired
		BlogDetailRepository bdRepository;
	
	// CREATE 
	public BlogDetail createBlog(BlogDetail blogDetail) {
	    return bdRepository.save(blogDetail);
	}
	
	// READ
	public List<BlogDetail> getBlogDetail() {
	    return bdRepository.findAll();
	}
	
	// READ BY ID
	public Optional<BlogDetail> getBlogDetailById(Long blogDetailId) {
	    return bdRepository.findById(blogDetailId);
	}
	
	// READ BY USER BLOGS
	public List<BlogDetail> getBlogDetailByUserId(Long blogUserId) {
	    return bdRepository.findByUserId(blogUserId);
	}
	
	// DELETE
	public void deleteBlogDetail(Long blogUserId) {
		bdRepository.deleteById(blogUserId);
	}
	
	    
	// UPDATE
	public BlogDetail updateBlogDetail(Long blogUserId, BlogDetail blogDetailInput) {
		BlogDetail blogDetail = bdRepository.findById(blogUserId).get();
		blogDetail.setUserId(blogDetailInput.getUserId());
		blogDetail.setBlogSubject(blogDetailInput.getBlogSubject());
		blogDetail.setBlogHeader(blogDetailInput.getBlogHeader());
		blogDetail.setBlogContent(blogDetailInput.getBlogContent());
		blogDetail.setBlogCoverImageUrl(blogDetailInput.getBlogCoverImageUrl());
	    return bdRepository.save(blogDetail);                                
	}
}
