package ru.geekbrains.lesson3.services;

import javax.smartcardio.Card;

public interface CardService {
    Card getCard(Long id);
}