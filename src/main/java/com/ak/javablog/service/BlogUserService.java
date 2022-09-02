package com.ak.javablog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.javablog.model.BlogUser;
import com.ak.javablog.repository.BlogUserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BlogUserService {

    @Autowired
    	BlogUserRepository buRepository;
    
    // CREATE 
    public BlogUser createBlogUser(BlogUser blogUser) {
        return buRepository.save(blogUser);
    }

    // READ
    public List<BlogUser> getBlogUser() {
        return buRepository.findAll();
    }
    
    // READ BY ID
    public Optional<BlogUser> getBlogUserById(Long blogUserId) {
        return buRepository.findById(blogUserId);
    }

    // DELETE
    public void deleteBlogUser(Long blogUserId) {
        buRepository.deleteById(blogUserId);
    }

        
 // UPDATE
    public BlogUser updateEmployee(Long blogUserId, BlogUser blogUserInput) {
    	BlogUser blogUser = buRepository.findById(blogUserId).get();
    	blogUser.setFullName(blogUserInput.getFullName());
    	blogUser.setEmailId(blogUserInput.getEmailId());
    	blogUser.setDisplayPictureUrl(blogUserInput.getDisplayPictureUrl());
        
        return buRepository.save(blogUser);                                
    }
}