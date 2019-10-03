package se.experis.finalTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import se.experis.finalTask.model.CharacterClass;
import se.experis.finalTask.repository.CharacterClassRepository;

@RestController
public class CharacterClassController {
	
	@Autowired
    private final CharacterClassRepository classRepository;
    
	
    public CharacterClassController(CharacterClassRepository classRepository) {
        this.classRepository = classRepository;
    }
	
	@GetMapping("/api/class/{className}")
    public CharacterClass getAll(@PathVariable String race) {
        return classRepository.findClassByRace(race);
    }
}
