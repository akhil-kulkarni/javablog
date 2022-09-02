package com.ak.javablog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.javablog.model.BlogUser;
import com.ak.javablog.service.BlogUserService;

@RestController
@RequestMapping("/blog-api")
public class BlogUserController {
    @Autowired
    	BlogUserService blogUserService;
        
    @RequestMapping(value="/users", method=RequestMethod.POST)
    public BlogUser createBlogUser(@RequestBody BlogUser blogUser) {
        return blogUserService.createBlogUser(blogUser);
    }

    
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<BlogUser> readBlogUsers() {
        return blogUserService.getBlogUser();
    }
    
    @RequestMapping(value="/users/{blogUserId}", method=RequestMethod.GET)
    public Optional<BlogUser> readBlogUserById(@PathVariable(value = "blogUserId") Long id) {
        return blogUserService.getBlogUserById(id);
    }

    @RequestMapping(value="/users/{blogUserId}", method=RequestMethod.PUT)
    public BlogUser readEmployees(@PathVariable(value = "blogUserId") Long id, @RequestBody BlogUser blogUserDetails) {
        return blogUserService.updateEmployee(id, blogUserDetails);
    }

    @RequestMapping(value="/users/{blogUserId}", method=RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "blogUserId") Long id) {
        blogUserService.deleteBlogUser(id);
    }

    
}