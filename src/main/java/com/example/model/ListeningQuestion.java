package com.example.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "listeningQuestion")
public class ListeningQuestion {
    @Column(name = "id")
    private String uuid;
    @Column(name = "listeningId")
    private String listeningUuid;
    @Column(name = "content")
    private String content;
    @Column(name = "answer")
    private String answerKey;

    public ListeningQuestion() {

    }

    public ListeningQuestion(String uuid, String listeningUuid, String content, String answerKey) {
        this.uuid = uuid;
        this.listeningUuid = listeningUuid;
        this.content = content;
        this.answerKey = answerKey;
    }

    @Id
    public String getId() {
        return uuid;
    }

    public void setId(String uuid) {
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
