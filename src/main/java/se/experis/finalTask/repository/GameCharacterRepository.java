package se.experis.finalTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.experis.finalTask.model.GameCharacter;

public interface GameCharacterRepository extends JpaRepository<GameCharacter, Integer>{
	
}
