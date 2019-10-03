package se.experis.finalTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.finalTask.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findUserById(int id);
}
