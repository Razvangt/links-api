package com.raz.linkApp.models;


import org.springframework.data.annotation.Id;

import java.util.List;

public class linkModel {
    @Id
    private String id;
    private String name;
    private String url;
    private List<String> tags;

    public linkModel() {
    }

    public linkModel(String id, String name, String url, List<String> tags) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
