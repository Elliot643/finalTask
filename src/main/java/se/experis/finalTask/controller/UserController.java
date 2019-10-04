package se.experis.finalTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import se.experis.finalTask.model.User;
import se.experis.finalTask.repository.UserRepository;

@RestController
@Controller
public class UserController {
	
    @Autowired
    public final UserRepository userRepository;
    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/api/user/{id}")
    public User getUserFromId(@PathVariable Integer id) {
        return userRepository.findUserById(id);
    }
    
    
	@PostMapping("/api/user")
	@ResponseBody
    public String addAUser(@RequestBody User aThing) {
        userRepository.save(aThing);

        return "200";
    }
	
	


    

}
