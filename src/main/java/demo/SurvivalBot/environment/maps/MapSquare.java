package demo.SurvivalBot.environment.maps;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "map_squares")
public class MapSquare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private int mapId;
    @Column
    private int x;
    @Column
    private int y;
    @ManyToMany
    @JoinColumn
    private Location location;
}
