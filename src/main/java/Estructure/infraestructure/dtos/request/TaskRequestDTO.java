package Estructure.infraestructure.dtos.request;


import Estructure.utils.Enums.Status;
import lombok.Data;

@Data
public class TaskRequestDTO {
    private String title;
    private String description;
    private Long groupId;
    private Status status;
}
