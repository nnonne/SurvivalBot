package demo.SurvivalBot.environment.shelters.repository;

import demo.SurvivalBot.environment.shelters.Shelter;
import demo.SurvivalBot.environment.shelters.ShelterId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelterRepository extends JpaRepository<Shelter, ShelterId> {
}
