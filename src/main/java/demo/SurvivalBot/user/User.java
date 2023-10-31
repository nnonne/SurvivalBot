package demo.SurvivalBot.user;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "telegram_id")
    private int telegramId;
    @JoinColumn(name = "character_id")
    private int characterId;
}
