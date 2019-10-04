package se.experis.finalTask.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import se.experis.finalTask.model.CharacterClass;
import se.experis.finalTask.model.GameCharacter;
import se.experis.finalTask.model.User;
import se.experis.finalTask.repository.GameCharacterRepository;
import se.experis.finalTask.repository.UserRepository;

import org.json.JSONObject;

@RestController
public class GameCharacterController {
	
	@Autowired
	private final GameCharacterRepository gameCharacterRepository;
	    
	public GameCharacterController(GameCharacterRepository gameCharacterRepository) {
		this.gameCharacterRepository = gameCharacterRepository;
	}	
	
	
	@PostMapping("/api/character")
	@ResponseBody
    public String addACharacter(@RequestBody GameCharacter info) {
		gameCharacterRepository.save(info);
		
        return "200";
    }
	
	@GetMapping("/api/character/{id}")
    public Optional<GameCharacter> getCharacterFromId(@PathVariable Integer id) {
        
		return gameCharacterRepository.findById(id);
    }
}
