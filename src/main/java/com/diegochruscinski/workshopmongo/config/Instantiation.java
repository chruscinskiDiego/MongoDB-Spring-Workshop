package com.diegochruscinski.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.diegochruscinski.workshopmongo.domain.Post;
import com.diegochruscinski.workshopmongo.domain.User;
import com.diegochruscinski.workshopmongo.dto.AuthorDTO;
import com.diegochruscinski.workshopmongo.repositories.PostRepository;
import com.diegochruscinski.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"),"Lets get it","Go travel!!", new AuthorDTO(alex));
		Post post2 = new Post(null, sdf.parse("01/01/2024"),"Party!!!","Happy new Year!!", new AuthorDTO(alex));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		alex.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(alex);
	} 

}
