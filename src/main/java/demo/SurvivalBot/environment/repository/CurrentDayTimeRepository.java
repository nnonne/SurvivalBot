package demo.SurvivalBot.environment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentDayTimeRepository extends JpaRepository<Character, Long> {
}
