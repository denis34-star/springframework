package ru.geekbrains.lesson3.services;


import ru.geekbrains.lesson3.controllers.RequiredArgsConstructor;
import ru.geekbrains.lesson3.repositories.CardRepository;

import javax.smartcardio.Card;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{
    private CardRepository cardRepository;


    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}

