package demo.SurvivalBot.environment.shelters;

import demo.SurvivalBot.character.GameCharacter;
import demo.SurvivalBot.environment.maps.MapSquare;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class ShelterId  implements Serializable {
    private MapSquare mapSquare;
    private GameCharacter character;
}
