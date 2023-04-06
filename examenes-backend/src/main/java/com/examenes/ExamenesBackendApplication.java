package com.examenes;

import com.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamenesBackendApplication.class, args);
	}

	@Override //method command line runner
	public void run(String... args) throws Exception {
		/*User user = new User();
		user.setName("Fabio");
		user.setLastName("Ramirez");
		user.setUsername("Lonquers");
		user.setPassword("12345");
		user.setEmail("hola@gmail.com");
		user.setCellphone("3215896578");
		user.setProfile("foto.jpg");

		Role role = new Role();
		role.setRolId(1L);
		role.setName("ADMIN");


		Set<UserRole> userRoles = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoles.add(userRole);

		User userSave = userService.saveUser(user,userRoles);

		System.out.println(userSave.getUsername());

		 */
	}
}
