package ru.geekbrains.spring.lesson1;

import org.springframework.stereotype.Component;

@Component("way")
public class Way implements Actions{
    @Override
    public void processing() {
        System.out.println("Пациенту сообщили номер кабинета врача и путь к нему.");
    }
}
