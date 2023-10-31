package demo.SurvivalBot.character.debuffs;

import jakarta.persistence.*;

@Entity
@Table(name = "condition_effects")
public class ConditionEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Condition condition;
    private String effectType;
    private int effectValue;
}
