package com.code.store.reviews;


import com.code.store.companies.Company;
import com.code.store.job.Job;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
@Entity

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String title;
    @OneToMany(mappedBy = "company")
    @JsonIgnore
    private List<Review> review;

    //private List<Review> reviews;
    public   Review() {

    }
    public long getId() {
        return id;   // ✅ add this getter
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title=title;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }
    @JsonIgnore
    @ManyToOne
    private Company company;
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}


