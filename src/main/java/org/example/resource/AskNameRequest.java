package org.example.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AskNameRequest {
    private long id;
    private String question;

    public AskNameRequest(long id, String question) {
        this.id = id;
        this.question = question;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public String getQuestion() {
        return question;
    }

    @JsonProperty
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Request{" + this.id + "," + question + "}";
    }
}
