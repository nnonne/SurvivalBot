package demo.SurvivalBot.character.debuffs.repository;

import demo.SurvivalBot.character.GameCharacter;
import demo.SurvivalBot.character.debuffs.ConditionList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentCharacterConditionsRepository extends JpaRepository<ConditionList, GameCharacter> {
}
