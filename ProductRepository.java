package ru.geekbrains.homework2;

import java.util.List;

public interface ProductRepository {
    Product findById(Long id);
    List<Product> findAll();
    Product saveOrUpdate(Product product);
    void deleteById(Long id);
}
