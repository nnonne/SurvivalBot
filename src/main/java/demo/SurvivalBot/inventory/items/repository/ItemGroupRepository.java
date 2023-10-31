package demo.SurvivalBot.inventory.items.repository;

import demo.SurvivalBot.inventory.items.ItemGroupList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemGroupRepository extends JpaRepository<ItemGroupList, Long> {
}
