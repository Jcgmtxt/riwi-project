package Estructure.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private GroupEntity groupEntity;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Enum status;


}
