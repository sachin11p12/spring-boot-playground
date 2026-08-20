package com.social.Media.models;

import jakarta.persistence.*;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "socialProfile")
//    @JoinColumn(name = "social_user") //   defining foreign key here -ts work as
    private SocialUser user;
}
