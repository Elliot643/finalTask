package se.experis.finalTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import se.experis.finalTask.controller.UserController;
import se.experis.finalTask.repository.UserRepository;

@Entity
@Table
public class GameCharacter {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	public int id;
	
	
	
	@Column(name = "user_id")
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	
	@ManyToOne(optional=false/*, fetch = FetchType.LAZY*/)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable=false)
	private User user;
		
	
	
	@Column(name = "class_id")
	private int classId;
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId=classId;
	}
	
	@ManyToOne(optional=false/*, fetch = FetchType.LAZY*/)
	@JoinColumn(name = "class_id", referencedColumnName = "class_id", insertable = false, updatable=false)
	private CharacterClass characterClass;
	
	
	
	@Column(name = "level")
	public int level;
	
	
	
}
