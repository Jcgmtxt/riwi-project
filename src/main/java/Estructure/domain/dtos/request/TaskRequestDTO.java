package Estructure.domain.dtos.request;

import Estructure.domain.entities.Enums.Status;
import lombok.Data;

@Data
public class TaskRequestDTO {
    private String title;
    private String description;
    private Long groupId;
    private Status status;
}
