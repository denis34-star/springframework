package ru.geekbrains.lesson3.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor


public class CardDTO {
    private Long id;
    private ProductDTO productDTO;
    private Long rating;
}
