package demo.SurvivalBot.character.buffs;

import jakarta.persistence.*;

@Entity
@Table(name = "proficiency_effects")
public class ProficiencyEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Proficiency proficiency;
    private String effectType;
    private int effectValue;
}