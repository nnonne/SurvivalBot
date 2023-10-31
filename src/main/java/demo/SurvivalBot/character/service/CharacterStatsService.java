package demo.SurvivalBot.character.service;

import demo.SurvivalBot.character.CharacterStats;
import demo.SurvivalBot.character.repository.CharacterStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterStatsService {
    private final CharacterStatsRepository characterStatsRepository;

    @Autowired
    public CharacterStatsService(CharacterStatsRepository characterStatsRepository) {
        this.characterStatsRepository = characterStatsRepository;
    }

    public CharacterStats createCharacterStats(CharacterStats characterStats) {
        return characterStatsRepository.save(characterStats);
    }

    public CharacterStats getCharacterStatsById(Long id) {
        return characterStatsRepository.findById(id).orElse(null);
    }

    public CharacterStats updateCharacterStats(Long id, CharacterStats updatedStats) {
        CharacterStats existingStats = characterStatsRepository.findById(id).orElse(null);
        if (existingStats == null) {
            return null; // Stats not found
        }

        // Update the existing stats with the new data
        existingStats.setHydration(updatedStats.getHydration());
        existingStats.setStamina(updatedStats.getStamina());
        existingStats.setBodyHeat(updatedStats.getBodyHeat());
        existingStats.setHealth(updatedStats.getHealth());
        existingStats.setCalories(updatedStats.getCalories());
        existingStats.setSpirit(updatedStats.getSpirit());

        return characterStatsRepository.save(existingStats);
    }

    public boolean deleteCharacterStats(Long id) {
        if (characterStatsRepository.existsById(id)) {
            characterStatsRepository.deleteById(id);
            return true; // Deletion successful
        } else {
            return false; // Stats not found
        }
    }
}
