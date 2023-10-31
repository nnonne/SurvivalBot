package demo.SurvivalBot.environment.maps.repository;

import demo.SurvivalBot.environment.maps.Location;
import demo.SurvivalBot.inventory.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationItemsRepository extends JpaRepository<Location, Item> {
}
