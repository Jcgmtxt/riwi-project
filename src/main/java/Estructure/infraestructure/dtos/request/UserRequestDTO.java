package Estructure.infraestructure.dtos.request;

import lombok.Data;

import javax.management.relation.Role;

@Data
public class UserRequestDTO {
    private String name;
    private String email;
    private String password;
    private Role role;

}
