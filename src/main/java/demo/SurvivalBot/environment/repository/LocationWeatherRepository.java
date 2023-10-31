package demo.SurvivalBot.environment.repository;

import demo.SurvivalBot.environment.Weather;
import demo.SurvivalBot.environment.maps.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationWeatherRepository extends JpaRepository<Weather, Location> {
}
