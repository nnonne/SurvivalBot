package demo.SurvivalBot.environment.animals;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_en")
    private String nameEN;
    @Column(name = "description_en")
    private String descriptionEN;
    @Column(name = "name_ua")
    private String nameUA;
    @Column(name = "description_ua")
    private String descriptionUA;

}
