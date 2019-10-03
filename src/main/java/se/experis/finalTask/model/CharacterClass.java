package se.experis.finalTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public CharacterClass() {
		
	}
}
