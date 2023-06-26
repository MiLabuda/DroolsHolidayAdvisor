package org.example;

import java.util.Scanner;

public class UserInteractionProvider {
    private UserInteraction userInteraction;

    public UserInteractionProvider() {
        this.userInteraction = new UserInteraction();
    }

    public UserInteraction getUserInteraction() {
        return userInteraction;
    }
}
