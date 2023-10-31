package demo.SurvivalBot.inventory.repository;

import demo.SurvivalBot.inventory.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
