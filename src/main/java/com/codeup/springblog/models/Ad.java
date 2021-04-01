package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
public class Ad {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String Title;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String Description;



    public Ad(){

    }

    public Ad(String title, String description) {
        Title = title;
        Description = description;
    }

    public Ad(Long id, String title, String description) {
        this.id = id;
        Title = title;
        Description = description;
    }
}
