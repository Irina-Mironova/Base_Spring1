package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Component;

@Component("schedule")
public class Schedule implements Actions{

    @Override
    public void processing() {
        System.out.println("Пациенту сообщили время работы врача.");
    }
}
