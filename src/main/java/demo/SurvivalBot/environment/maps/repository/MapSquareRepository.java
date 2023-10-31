package demo.SurvivalBot.environment.maps.repository;

import demo.SurvivalBot.environment.maps.MapSquare;
import demo.SurvivalBot.environment.maps.RouteMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapSquareRepository extends JpaRepository<MapSquare, RouteMap> {
}
