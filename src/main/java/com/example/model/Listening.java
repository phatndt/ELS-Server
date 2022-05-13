package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listening")
public class Listening {
    private String uuid;
    private String title;
    private int duration;

    public Listening() {}

    public Listening(String uuid, String title, int duration) {
        this.uuid = uuid;
        this.title = title;
        this.duration = duration;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    @Id
    public String getId() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
