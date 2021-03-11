package ru.geekbrains.lesson3.services;

import javax.smartcardio.Card;

public interface ProductService {
    Card getProduct(Long id);
}
