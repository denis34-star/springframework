package ru.geekbrains.lesson3.mappers;

import ru.geekbrains.lesson3.dto.UserDTO;

@Mapper
public interface UserMapper {
    UserDTO toDTO(User user);

}
