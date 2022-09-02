package com.ak.javablog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog_comment")
public class BlogComment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
        private Long id;
    
    @Column(name="blog_id")
    private Long blogStatus;
    
    @Column(name="user_id")
    private Long userId;
    
    @Column(name="comment_status")
    private String commentStatus;
    
    @Column(name="blog_comment")
    private String blogComment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBlogStatus() {
		return blogStatus;
	}

	public void setBlogStatus(Long blogStatus) {
		this.blogStatus = blogStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getBlogComment() {
		return blogComment;
	}

	public void setBlogComment(String blogComment) {
		this.blogComment = blogComment;
	}

}
