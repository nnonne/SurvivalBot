package demo.SurvivalBot.character;

import demo.SurvivalBot.character.buffs.ProficiencyList;
import demo.SurvivalBot.character.debuffs.ConditionList;
import demo.SurvivalBot.environment.CurrentDayTime;
import demo.SurvivalBot.environment.Weather;
import demo.SurvivalBot.inventory.Inventory;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "characters")
public class GameCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "character_name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    private int userId;


    @OneToOne
    @JoinColumn(name = "stats")
    private CharacterStats characterStats;

    @Column(name = "current_level")
    private int level;

    @Column(name = "current_experience_points")
    private int xp;

    @ManyToOne
    @JoinColumn(name = "map_id")
    private int mapId;
    @ManyToOne
    @JoinColumn(name = "map_square_id")
    private int mapSquareId;

    @ManyToMany
    @JoinColumn(name = "current_weather")
    private Weather currentWeather;

    @Column(name = "current_day_time")
    private CurrentDayTime currentDayTime;

    @Column(name = "occupied_inventory_space", nullable = false)
    private int occupiedInventorySpace;
    @Column(name = "current_max_space", nullable = false)
    private int currentMaxInventorySpace;
    private Inventory inventory;

    @ManyToMany
    @JoinColumn(name = "proficiency")
    private ProficiencyList proficiency;
    @OneToMany
    @Column(name = "current_conditions")
    private List<ConditionList> currentConditions;



}
