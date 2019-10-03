package se.experis.finalTask.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class CharacterClass {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	public int id;
	
	@Column(name = "race")
	public String race;
	
	@Column(name = "description")
	public String description;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<GameCharacter> gameCharacter;
}
