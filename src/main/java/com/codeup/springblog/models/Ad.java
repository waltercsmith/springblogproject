package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String Title;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String Description;
}
