package demo.SurvivalBot.environment.animals.repository;

import demo.SurvivalBot.environment.animals.AnimalAction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalActionRepository extends JpaRepository<AnimalAction, Long> {
}
