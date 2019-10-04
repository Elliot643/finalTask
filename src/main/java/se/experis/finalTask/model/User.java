package se.experis.finalTask.model;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import se.experis.finalTask.controller.UserController;
import se.experis.finalTask.repository.UserRepository;

@Entity
@Table
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
	public int id;
	
	@Column(name = "userName")
	public String userName;
	
	@Column(name = "pw")
	public String pw;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<GameCharacter> gameCharacter;
	
	public List<GameCharacter> getCharacters() {
		return gameCharacter;
	}
	
}
