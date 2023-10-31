package demo.SurvivalBot.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_statistics")
public class UserStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int gamesWon;
    private int daysLived;
    private double milesWalked;
    private int forageAttempts;
    private int woodGatheringAttempts;
    private int fishingAttempts;
    private int sheltersBuilt;
    private int woundsTreated;
    private int huntingAttempts;
    private int craftsMade;
    private int repairsMade;
}
