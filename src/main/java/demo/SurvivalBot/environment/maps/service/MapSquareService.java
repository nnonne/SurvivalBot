package demo.SurvivalBot.environment.maps.service;

import demo.SurvivalBot.environment.maps.MapSquare;
import demo.SurvivalBot.environment.maps.repository.MapSquareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapSquareService {
    private final MapSquareRepository mapSquareRepository;

    @Autowired
    public MapSquareService(MapSquareRepository mapSquareRepository) {
        this.mapSquareRepository = mapSquareRepository;
    }

    public MapSquare createMapSquare(MapSquare mapSquare) {
        return mapSquareRepository.save(mapSquare);
    }

    public MapSquare getMapSquareById(Long id) {
        return mapSquareRepository.findById(id).orElse(null);
    }

    public MapSquare updateMapSquare(Long id, MapSquare updatedMapSquare) {
        MapSquare existingMapSquare = mapSquareRepository.findById(id).orElse(null);
        if (existingMapSquare == null) {
            return null; // MapSquare not found
        }

        // Update the existing map square with the new data
        existingMapSquare.setMapId(updatedMapSquare.getMapId());
        existingMapSquare.setX(updatedMapSquare.getX());
        existingMapSquare.setY(updatedMapSquare.getY());
        existingMapSquare.setLocation(updatedMapSquare.getLocation());

        return mapSquareRepository.save(existingMapSquare);
    }

    public boolean deleteMapSquare(Long id) {
        if (mapSquareRepository.existsById(id)) {
            mapSquareRepository.deleteById(id);
            return true; // Deletion successful
        } else {
            return false; // MapSquare not found
        }
    }
}
