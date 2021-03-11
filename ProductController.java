package ru.geekbrains.lesson3.controllers;


import ru.geekbrains.lesson3.dto.ProductDTO;
import ru.geekbrains.lesson3.mappers.ProductMapper;
import ru.geekbrains.lesson3.services.ProductService;

import javax.smartcardio.Card;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    public ProductDTO sayHello(@PathVariable Long id) {
        Card product = productService.getProduct(id);
        return productMapper.toDTO(product);
    }
}
