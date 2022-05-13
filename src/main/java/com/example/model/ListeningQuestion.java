package com.example.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "listeningquestion")
public class ListeningQuestion {
    private String uuid;
    private String listeningUuid;
    private String content;
    private String answer;

    public ListeningQuestion() {

    }

    public ListeningQuestion(String uuid, String listeningUuid, String content, String answer) {
        this.uuid = uuid;
        this.listeningUuid = listeningUuid;
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

    @Column(name = "listeningid")
    public String getlisteningUuid() {
        return listeningUuid;
    }

    @Column(name = "listeningid")
    public void setlisteningUuid(String listeningUuid) {
        this.listeningUuid = listeningUuid;
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
