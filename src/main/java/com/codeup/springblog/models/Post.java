package com.codeup.springblog.models;




import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {


    @Column(length = 225, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", length = 2000, nullable = false)
    private String body;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Post(){

    }

    public Post(Long id){
        this.id = id;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
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

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }





}
