package Estructure.infraestructure.mapper;

import Estructure.infraestructure.dtos.request.UserRequestDTO;
import Estructure.infraestructure.dtos.response.UserResponseDTO;
import Estructure.domain.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserRequestDTO userToUserRequestDTO(UserEntity userEntity);
    UserEntity userToUserResponseDTO(UserResponseDTO userResponseDTO);

}
