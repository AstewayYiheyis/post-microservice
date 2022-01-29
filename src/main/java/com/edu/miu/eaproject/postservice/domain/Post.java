package com.edu.miu.eaproject.postservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long userid;
    private String title;
    private String body;
    private int likes;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userId) {
        this.userid = userId;
    }

    public int getLikes() {
        return likes;
    }

    public void addLikes() {
        likes++;
    }
    public void removeLikes() {
        if(likes>0)
            likes--;
    }

    public Post() {
    }

    public Post(Long userid, String title, String body, int likes) {
        this.userid = userid;
        this.title = title;
        this.body = body;
        this.likes = likes;
    }
}
