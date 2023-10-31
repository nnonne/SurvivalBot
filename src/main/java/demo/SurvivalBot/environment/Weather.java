package demo.SurvivalBot.environment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "weather_states")
public class Weather {
    @Column(name = "name_en")
    private String nameEN;
    @Column(name = "description_en")
    private String descriptionEN;
    @Column(name = "name_ua")
    private String nameUA;
    @Column(name = "description_ua")
    private String descriptionUA;
    @Column
    private int temperature;
    @Column
    private int windSpeed;
}
