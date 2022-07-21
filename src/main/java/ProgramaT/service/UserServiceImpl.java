package ProgramaT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProgramaT.entity.User;
import ProgramaT.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

}
