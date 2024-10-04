package Estructure.domain.dtos.response;

import lombok.Data;

import javax.management.relation.Role;

@Data
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private Role role;

}
