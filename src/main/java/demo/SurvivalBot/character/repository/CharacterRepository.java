package demo.SurvivalBot.character.repository;

import demo.SurvivalBot.character.GameCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<GameCharacter, Long> {
}