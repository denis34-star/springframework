package ru.geekbrains.lesson3.controllers;

import ru.geekbrains.lesson3.dto.CardDTO;
import ru.geekbrains.lesson3.mappers.CardMapper;
import ru.geekbrains.lesson3.mappers.GetMapping;
import ru.geekbrains.lesson3.services.CardService;

import javax.smartcardio.Card;

@RestController
@RequiredArgsConstructor

public class CardController {
    private final CardService cardService;
    private final CardMapper cardMapper;

    public CardController(CardService cardService, CardMapper cardMapper) {
        this.cardService = cardService;
        this.cardMapper = cardMapper;
    }


    @GetMapping
    public CardDTO getCardById(@PathVariable Long id) {
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }

}
