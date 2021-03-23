package net.learning.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.learning.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
