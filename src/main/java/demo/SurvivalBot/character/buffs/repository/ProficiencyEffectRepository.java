package demo.SurvivalBot.character.buffs.repository;

import demo.SurvivalBot.character.buffs.ProficiencyList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProficiencyEffectRepository extends JpaRepository<ProficiencyList,Long> {
}
