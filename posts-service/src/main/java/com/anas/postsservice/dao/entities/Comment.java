package com.anas.postsservice.dao.entities;

import jakarta.persistence.*;

import java.util.Date;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long c_id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    private String content;

    @ManyToOne
    private User author;

    private Date timestamp;
}
