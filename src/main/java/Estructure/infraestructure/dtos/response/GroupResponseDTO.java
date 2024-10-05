package Estructure.infraestructure.dtos.response;

import lombok.Data;

@Data
public class GroupResponseDTO {
    private Long id;
    private Long projectId;
    private Long userId;
    private String groupName;
}
