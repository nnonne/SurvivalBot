package demo.SurvivalBot.environment.maps.repository;

import demo.SurvivalBot.environment.maps.RouteMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapRepository extends JpaRepository<RouteMap, Long> {
}
