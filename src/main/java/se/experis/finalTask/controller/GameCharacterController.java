package se.experis.finalTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import se.experis.finalTask.model.GameCharacter;
import se.experis.finalTask.model.User;
import se.experis.finalTask.repository.GameCharacterRepository;



@RestController
public class GameCharacterController {
	
	@Autowired
	private final GameCharacterRepository gameCharacterRepository;
	    
	public GameCharacterController(GameCharacterRepository gameCharacterRepository) {
		this.gameCharacterRepository = gameCharacterRepository;
	}
	
	@PostMapping("/api/character")
	@ResponseBody
    public String addACharacter(@RequestBody GameCharacter gc) {
		gameCharacterRepository.save(gc);

        return "200";
    }
	
	@GetMapping("/api/character/{id}")
    public List<User> getCharacterFromId(int id) {
        return null;
    }
}
