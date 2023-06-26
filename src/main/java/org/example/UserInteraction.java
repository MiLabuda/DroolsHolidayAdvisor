package org.example;

import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner;

    public UserInteraction() {
        this.scanner = new Scanner(System.in);
    }

    public String askQuestionAndGetAnswer(Question question) {
        System.out.println(question.getContent());
        for (int i = 0; i < question.getAnswersAndResultingDecisions().size(); i++) {
            System.out.println((i + 1) + ". " + question.getAnswersAndResultingDecisions().get(i));
        }
        int selectedIndex = scanner.nextInt() - 1;
        return question.getAnswersAndResultingDecisions().get(selectedIndex);
    }
}

