package org.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesEngine {

    private final KieSession kieSession;

    public RulesEngine() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        kieSession = kieContainer.newKieSession();
    }

    public void runRules() {
        kieSession.getAgenda().getAgendaGroup("rules1").setFocus();
        kieSession.fireAllRules();

        kieSession.getAgenda().getAgendaGroup("rules2").setFocus();
        kieSession.fireAllRules();

        // ...

        kieSession.getAgenda().getAgendaGroup("rules10").setFocus();
        kieSession.fireAllRules();
    }

    public void insertFact(Object fact) {
        kieSession.insert(fact);
    }

    public void dispose() {
        kieSession.dispose();
    }
}