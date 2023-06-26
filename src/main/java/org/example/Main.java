package org.example;

public class Main {
    public static void main(String[] args) {
        RulesEngine rulesEngine = new RulesEngine();
        VacationDecisionState state = new VacationDecisionState();

        // Wstrzyknięcie faktów do silnika reguł
        rulesEngine.insertFact(new UserInteractionProvider());
        rulesEngine.insertFact(new VacationDecisionState());

        // Uruchomienie reguł
        rulesEngine.runRules();

        // Zwolnienie zasobów
        rulesEngine.dispose();

        // Wyświetlanie wyniku
        System.out.println(state.getQuestion() + " Odpowiedź: " + state.isInPoland());

    }
}