package com.victorm.model;

import java.util.ArrayList;
import java.util.List;

public class PackingModel {

    private String articles;
    private List<String> cartons;

    public PackingModel(String articles) {
        this.articles = articles;
        this.cartons = new ArrayList<>();
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(String articles) {
        this.articles = articles;
    }

    public List<String> getCartons() {
        return cartons;
    }

    public void setCartons(List<String> cartons) {
        this.cartons = cartons;
    }
}