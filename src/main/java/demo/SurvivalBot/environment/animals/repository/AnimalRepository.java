package demo.SurvivalBot.environment.animals.repository;

import demo.SurvivalBot.environment.animals.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}