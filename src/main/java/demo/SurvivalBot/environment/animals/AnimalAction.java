package demo.SurvivalBot.environment.animals;

import jakarta.persistence.*;

@Entity
@Table(name = "animal_actions")
public class AnimalAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String actionName;
}