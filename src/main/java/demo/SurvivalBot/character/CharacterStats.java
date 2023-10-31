package demo.SurvivalBot.character;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "character_stats")
public class CharacterStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int hydration;
    @Column
    private int stamina;
    @Column
    private int bodyHeat;
    @Column
    private int health;
    @Column
    private int calories;
    @Column
    private int spirit;
}
