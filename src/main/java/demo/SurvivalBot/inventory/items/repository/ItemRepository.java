package demo.SurvivalBot.inventory.items.repository;

import demo.SurvivalBot.inventory.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
