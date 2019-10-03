package se.experis.finalTask.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import se.experis.finalTask.model.User;



@RestController
public class GameCharacterController {
	
	
	@PostMapping("/api/character")
    public String addACharacter() {
        

        return "200";
    }
	
	@GetMapping("/api/character/{id}")
    public List<User> getCharacterFromId(int id) {
        return null;
    }
}
