package Estructure.infraestructure.dtos.response;

import lombok.*;

import javax.management.relation.Role;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private Role role;

}
