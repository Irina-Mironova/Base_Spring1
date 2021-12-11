package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Component;

@Component("archive")
public class Archive implements Actions{

    @Override
    public void processing() {
        System.out.println("Пациенту принесли карточку из архива.");
    }

}
