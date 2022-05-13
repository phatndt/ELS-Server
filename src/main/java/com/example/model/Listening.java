package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listening")
public class Listening {
    @Column(name = "id")
    private String uuid;
    @Column(name = "title")
    private String title;
    @Column(name = "id")
    private int duration;
    @Column(name = "audio")
    private String audio;

    public Listening() {}

    public Listening(String uuid, String title, int duration, String audio) {
        this.uuid = uuid;
        this.title = title;
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
}
