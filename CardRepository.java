package ru.geekbrains.lesson3.repositories;

import javax.smartcardio.Card;

@Repository
public interface CardRepository extends CrudRepository <Card, Long>{
    Card getById(Long id);

}
