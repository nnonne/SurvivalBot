package demo.SurvivalBot.character.repository;

import demo.SurvivalBot.character.CharacterAction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterActivitiesRepository extends JpaRepository<CharacterAction, Long> {
}
