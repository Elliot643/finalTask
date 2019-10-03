package se.experis.finalTask.model;

import javax.persistence.*;

@Entity
@Table
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	public int id;
	
	@Column(name = "userName")
	public String userName;
	
	@Column(name = "pw")
	public String pw;
	
	public User(){
        id = 0;
        userName = "Jonas";
        pw = "password";
    }

	
}
