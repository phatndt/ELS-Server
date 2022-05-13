package com.example.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "listeningQuestion")
public class ListeningQuestion {
    private String uuid;
    private String listeningId;
    private String content;
    private String answer;

    public ListeningQuestion() {

    }

    public ListeningQuestion(String uuid, String listeningId, String content, String answer) {
        this.uuid = uuid;
        this.listeningId = listeningId;
        this.content = content;
        this.answer = answer;
    }

    @Id
    public String getId() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public String getlisteningId() {
        return listeningId;
    }

    public void setlisteningId(String listeningId) {
        this.listeningId = listeningId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getanswer() {
        return answer;
    }

    public void setanswer(String answer) {
        this.answer = answer;
    }
}
