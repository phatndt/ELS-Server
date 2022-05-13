package com.example.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "listening_question")
public class ListeningQuestion {
    private String uuid;
    private String listeningUuid;
    private String content;
    private String answerKey;

    @Id
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getListeningUuid() {
        return listeningUuid;
    }

    public void setListeningUuid(String listeningUuid) {
        this.listeningUuid = listeningUuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }
}
