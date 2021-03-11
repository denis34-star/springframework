package ru.geekbrains.lesson3.model;

import ru.geekbrains.lesson3.controllers.Product;
import ru.geekbrains.lesson3.dto.AllArgsConstructor;
import ru.geekbrains.lesson3.dto.NoArgsConstructor;

@Entity
@Table(name = "cards")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;
    private Long rating;

    public Card(Long id, Product product) {
        this.id = id;
        this.product = product;
    }

    private class IDENTITY {
    }
}

