package demo.SurvivalBot.environment.repository;

import demo.SurvivalBot.environment.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
