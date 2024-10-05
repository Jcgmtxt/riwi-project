package Estructure.infraestructure.dtos.response;


import Estructure.utils.Enums.Status;
import lombok.Data;

@Data
public class TaskResponseDTO {
    private Long id;
    private String title;
    private String description;
    private Long groupId;
    private Status status;
}
