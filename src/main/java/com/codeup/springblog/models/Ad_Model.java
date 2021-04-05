package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad_Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column( nullable = false, length = 100)
    private String Title;

    @Column( nullable = false, columnDefinition = "TEXT")
    private String Description;


    public Ad_Model() {
    }

    public Ad_Model(Long id, String title, String description) {
        this.id = id;
        this.Title = title;
        this.Description = description;
    }

    public Ad_Model(String title, String description) {
        this.Title = title;
        this.Description = description;
    }


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
        this.Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }
}
