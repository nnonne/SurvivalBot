package demo.SurvivalBot.environment.maps.repository;

import demo.SurvivalBot.environment.maps.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
