package se.experis.finalTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.finalTask.model.CharacterClass;

public interface CharacterClassRepository extends JpaRepository<CharacterClass, String>{
	
	CharacterClass findClassByRace(String race);
}
