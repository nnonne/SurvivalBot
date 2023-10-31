package demo.SurvivalBot.inventory.items;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "item_groups")
public class ItemGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_group_en")
    private String itemGroupEN;

    @Column(name = "item_group_ua")
    private String itemGroupUA;
}
