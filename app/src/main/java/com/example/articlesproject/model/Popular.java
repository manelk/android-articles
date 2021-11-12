package com.example.articlesproject.model;

public class Popular {
    private String title, name, createdAt, category, stars;
    private int coverImage, profileImage;

    public Popular(String title, String name, String createdAt, String category, String stars, int coverImage, int profileImage) {
        this.title = title;
        this.name = name;
        this.createdAt = createdAt;
        this.category = category;
        this.stars = stars;
        this.coverImage = coverImage;
        this.profileImage = profileImage;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCategory() {
        return category;
    }

    public String getStars() {
        return stars;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
