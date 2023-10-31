package demo.SurvivalBot.environment.maps.repository;

import demo.SurvivalBot.character.CharacterAction;
import demo.SurvivalBot.environment.maps.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationActivitiesRepository extends JpaRepository<Location, CharacterAction> {
}
