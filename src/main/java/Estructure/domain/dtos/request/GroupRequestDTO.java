package Estructure.domain.dtos.request;

import lombok.Data;

@Data
public class GroupRequestDTO {
    private Long projectId;
    private Long userId;
    private String groupName;
}
