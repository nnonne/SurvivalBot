package demo.SurvivalBot.environment.shelters;

import demo.SurvivalBot.character.GameCharacter;
import demo.SurvivalBot.environment.maps.MapSquare;
import jakarta.persistence.*;



@Embeddable
@Entity
@Table(name = "shelters")
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @EmbeddedId
    private ShelterId shelterId;

    private int shelter ;
    private int bed;
    private int firewall;
    private boolean rainCatcher;
    private int windBlock;
    private int fireplace;
    private Trap trap;
}
