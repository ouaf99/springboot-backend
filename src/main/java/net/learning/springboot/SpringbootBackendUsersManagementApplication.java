package net.learning.springboot;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner; */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import net.learning.springboot.model.User;
import net.learning.springboot.repository.UserRepository;
*/

@SpringBootApplication
public class SpringbootBackendUsersManagementApplication /*implements CommandLineRunner */{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendUsersManagementApplication.class, args);
	}
	/*
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
 		this.userRepository.save(new User("Ouafae", "Ouhadi", "ouafae@gmail.com"));
 		this.userRepository.save(new User("Mohamed", "Mezgouri", "mohamed@gmail.com"));		
 		this.userRepository.save(new User("Hafsa", "Mahboub", "hafsa@gmail.com"));		
 
	}
	*/


}

