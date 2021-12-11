package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("registration")
public class Registration {
  private List<Actions> actions = new ArrayList<>();

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    public void doVisit(){
        System.out.println("В регистратуру обратился пациент.");
        actions.stream().forEach(a -> a.processing());
    }
}
