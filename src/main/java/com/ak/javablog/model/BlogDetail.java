package com.ak.javablog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "blog_detail")
public class BlogDetail {
	
//	@OneToOne(mappedBy="user_id")
//	@JoinTable(name="blog_user",
//			joinColumns = @JoinColumn(name="id"), 
//		    inverseJoinColumns = @JoinColumn(name = "user_id"))
	
//	BlogUser blogUser;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
        private Long id;
    
    @Column(name="blog_status")
    private String blogStatus;
    
    @Column(name="user_id")
    private Long userId;
    
    @Column(name="blog_subject")
    private String blogSubject;
    
    @Column(name="like_count")
    private int likeCount;
    
    @Column(name="blog_header")
    private String blogHeader;
    
    @Column(name="blog_content")
    private String blogContent;
    
    @Column(name="blog_cover_image_url")
    private String blogCoverImageUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBlogStatus() {
		return blogStatus;
	}

	public void setBlogStatus(String blogStatus) {
		this.blogStatus = blogStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getBlogSubject() {
		return blogSubject;
	}

	public void setBlogSubject(String blogSubject) {
		this.blogSubject = blogSubject;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getBlogHeader() {
		return blogHeader;
	}

	public void setBlogHeader(String blogHeader) {
		this.blogHeader = blogHeader;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public String getBlogCoverImageUrl() {
		return blogCoverImageUrl;
	}

	public void setBlogCoverImageUrl(String blogCoverImageUrl) {
		this.blogCoverImageUrl = blogCoverImageUrl;
	}
    
    
}
