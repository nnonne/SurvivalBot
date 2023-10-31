package demo.SurvivalBot.character.repository;

import demo.SurvivalBot.character.CharacterStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterStatsRepository extends JpaRepository<CharacterStats, Long> {
}