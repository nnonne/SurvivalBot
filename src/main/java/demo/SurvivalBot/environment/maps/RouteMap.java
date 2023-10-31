package demo.SurvivalBot.environment.maps;

import jakarta.persistence.*;

@Entity
@Table(name = "maps")
public class RouteMap {
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
