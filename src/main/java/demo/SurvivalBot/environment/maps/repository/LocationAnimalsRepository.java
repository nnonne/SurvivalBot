package demo.SurvivalBot.environment.maps.repository;

import demo.SurvivalBot.environment.animals.Animal;
import demo.SurvivalBot.environment.maps.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationAnimalsRepository extends JpaRepository<Location, Animal> {
}
