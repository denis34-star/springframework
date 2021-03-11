package ru.geekbrains.lesson3.repositories;

@Repository
public interface ProductRepository extends CreudRepository<Product, Long>{
    Product getById(Long id);
}
