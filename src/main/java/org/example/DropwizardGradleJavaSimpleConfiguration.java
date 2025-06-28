package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import jakarta.validation.constraints.NotEmpty;

public class DropwizardGradleJavaSimpleConfiguration extends Configuration {

    @NotEmpty
    private String question;

    @NotEmpty
    private String greetingTemplate;

    @JsonProperty
    public String getQuestion() {
        return question;
    }

    @JsonProperty
    public void setQuestion(String question) {
        this.question = question;
    }

    @JsonProperty
    public String getGreetingTemplate() {
        return greetingTemplate;
    }

    @JsonProperty
    public void setGreetingTemplate(String greetingTemplate) {
        this.greetingTemplate = greetingTemplate;
    }
}
