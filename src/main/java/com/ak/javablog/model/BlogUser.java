package com.ak.javablog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog_user")
public class BlogUser {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
        private Long id;
    
    @Column(name="full_name")
    private String fullName;
    
    @Column(name="email_id")
    private String emailId;
    
    @Column(name="display_picture_url")
    private String displayPictureUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDisplayPictureUrl() {
		return displayPictureUrl;
	}

	public void setDisplayPictureUrl(String displayPictureUrl) {
		this.displayPictureUrl = displayPictureUrl;
	}

}
