package ru.geekbrains.homework2;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Integer price;

    public Product(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
