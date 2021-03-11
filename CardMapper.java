package ru.geekbrains.lesson3.mappers;

import ru.geekbrains.lesson3.dto.CardDTO;

import javax.smartcardio.Card;

public interface CardMapper {
    CardDTO toDTO(Card card);
}
