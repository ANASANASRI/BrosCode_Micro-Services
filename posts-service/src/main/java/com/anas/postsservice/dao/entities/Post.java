package com.anas.postsservice.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString //générer automatiquement une méthode toString()
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;

    @Column(nullable = false) //spécifier que la colonne ne peut pas contenir de valeurs nulles.
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    private int likes;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    private int shares;

    private String privacySettings;

    @ElementCollection
    private List<String> hashtags;

    private String location;

    private String url;
}