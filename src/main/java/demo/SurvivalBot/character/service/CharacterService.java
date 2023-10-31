package demo.SurvivalBot.character.service;

import demo.SurvivalBot.character.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.SurvivalBot.character.GameCharacter;
import java.util.List;



@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public GameCharacter createCharacter(GameCharacter character) {
        return characterRepository.save(character);
    }

    public GameCharacter getCharacterById(Long characterId) {
        return characterRepository.findById(characterId).orElse(null);
    }

    public List<GameCharacter> getAllCharacters() {
        return characterRepository.findAll();
    }

    public GameCharacter updateCharacter(Long characterId, GameCharacter updatedCharacter) {
        GameCharacter existingCharacter = characterRepository.findById(characterId).orElse(null);
        if (existingCharacter == null) {
            return null;
        }

        // Update the existing character with the new data
        existingCharacter.setName(updatedCharacter.getName());
        existingCharacter.setCharacterStats(updatedCharacter.getCharacterStats());
        existingCharacter.setOccupiedInventorySpace(updatedCharacter.getOccupiedInventorySpace());
        existingCharacter.setCurrentMaxInventorySpace(updatedCharacter.getCurrentMaxInventorySpace());
        existingCharacter.setInventory(updatedCharacter.getInventory());
        existingCharacter.setProficiency(updatedCharacter.getProficiency());
        existingCharacter.setCurrentConditions(updatedCharacter.getCurrentConditions());
        existingCharacter.setMapId(updatedCharacter.getMapId());
        existingCharacter.setMapSquareId(updatedCharacter.getMapSquareId());
        existingCharacter.setCurrentWeather(updatedCharacter.getCurrentWeather());
        existingCharacter.setCurrentDayTime(updatedCharacter.getCurrentDayTime());

        return characterRepository.save(existingCharacter);
    }

    public boolean deleteCharacter(Long characterId) {
        if (characterRepository.existsById(characterId)) {
            characterRepository.deleteById(characterId);
            return true; // Deletion successful
        } else {
            return false; // Character not found
        }
    }
}



