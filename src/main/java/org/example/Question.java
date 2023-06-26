package org.example;


import java.util.List;

public class Question {
    private String content;
    private List<String> answersAndResultingDecisions;

    public Question(String content, List<String> answersAndResultingDecisions) {
        this.content = content;
        this.answersAndResultingDecisions = answersAndResultingDecisions;
    }

    public String getContent() {
        return content;
    }

    public List<String> getAnswersAndResultingDecisions() {
        return answersAndResultingDecisions;
    }


}
