package ru.geekbrains.lesson3.mappers;

import ru.geekbrains.lesson3.dto.ProductDTO;

import javax.smartcardio.Card;

public interface ProductMapper {
    ProductDTO toDTO(Card product);
}
