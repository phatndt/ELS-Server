package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listening")
public class Listening {
    private String uuid;
    private String title;
    private String content;
    private int duration;
    private String audio;

    public Listening() {}

    public Listening(String uuid, String title, String content, int duration, String audio) {
        this.uuid = uuid;
        this.title = title;
        this.content = content;
        this.duration = duration;
        this.audio = audio;
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

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
