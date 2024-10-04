package Estructure.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @ManyToMany
    @JoinColumn(name = "task_id", nullable = false)
    private TaskEntity taskEntity;

}
