package Estructure.domain.entities;


import Estructure.utils.Enums.Status;
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

    @Enumerated(EnumType.STRING)
    private Status status;


}
