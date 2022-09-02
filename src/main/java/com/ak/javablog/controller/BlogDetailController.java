package com.ak.javablog.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.javablog.model.BlogDetail;
import com.ak.javablog.service.BlogDetailService;

@RestController
@RequestMapping("/blog-api")
public class BlogDetailController {
	@Autowired
		BlogDetailService blogDetailService;
	    
	@RequestMapping(value="/blog", method=RequestMethod.POST)
	public BlogDetail createBlog(@RequestBody BlogDetail blogDetail) {
	    return blogDetailService.createBlog(blogDetail);
	}
	
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public List<BlogDetail> readBlogUsers() {
	    return blogDetailService.getBlogDetail();
	}
	
	@RequestMapping(value="/blog/{blogId}", method=RequestMethod.GET)
	public Optional<BlogDetail> readBlogUserById(@PathVariable(value = "blogId") Long blogDetailId) {
	    return blogDetailService.getBlogDetailById(blogDetailId);
	}
	
	@RequestMapping(value="/blog/user/{blogUserId}", method=RequestMethod.GET)
	public List<BlogDetail> readBlogDetailByUserId(@PathVariable(value = "blogUserId") Long blogUserId) {
	    return blogDetailService.getBlogDetailByUserId(blogUserId);
	}
	
	@RequestMapping(value="/blog/{blogUserId}", method=RequestMethod.PUT)
	public BlogDetail readBlogDetail(@PathVariable(value = "blogUserId") Long id, @RequestBody BlogDetail blogDetails) {
	    return blogDetailService.updateBlogDetail(id, blogDetails);
	}
	
	@RequestMapping(value="/blog/{blogUserId}", method=RequestMethod.DELETE)
	public void deleteBlogDetail(@PathVariable(value = "blogUserId") Long id) {
		blogDetailService.deleteBlogDetail(id);
	}
}
