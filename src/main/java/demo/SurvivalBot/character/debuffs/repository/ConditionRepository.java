package demo.SurvivalBot.character.debuffs.repository;

import demo.SurvivalBot.character.debuffs.ConditionList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConditionRepository extends JpaRepository<ConditionList, Long> {
}