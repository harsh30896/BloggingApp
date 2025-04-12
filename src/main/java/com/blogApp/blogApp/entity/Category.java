package com.blogApp.blogApp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Post> posts = new ArrayList<>();


    public Long getCategoryIdId() {
        return categoryId;
    }

    public void setCategoryIdId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Category(Long categoryId, String name, String description, List<Post> posts) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + categoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", posts=" + posts +
                '}';
    }
}
