package ProgramaT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ProgramaT.entity.User;
import ProgramaT.repository.RoleRepository;
import ProgramaT.repository.UserRepository;
import ProgramaT.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	RoleRepository roleRepository;
	

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String userForm(Model model){
		model.addAttribute("userForm", new User());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles", roleRepository.findAll());
		model.addAttribute("listTab", "active");
		
		return "user-form/user-view";
	}
	
	
}
