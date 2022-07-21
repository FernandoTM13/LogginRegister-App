package ProgramaT.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ProgramaT.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
		
	public Set<User> findByusername(String username);

	
}
