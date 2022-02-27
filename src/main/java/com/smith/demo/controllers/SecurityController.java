package com.smith.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smith.demo.dao.UserAccountsRepository;
import com.smith.demo.entitis.UserAccounts;

@Controller
public class SecurityController {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserAccountsRepository userAccountRepo;
	
	@RequestMapping(value="/register")
	public String registerForm(Model model){
		UserAccounts userAccount = new UserAccounts();
		model.addAttribute("userAccount" , userAccount);
		return "security/register";
	}
	
	@RequestMapping(value="/register/save" , method = RequestMethod.POST)
	public String register(Model model , UserAccounts user){
		user.setPassword(encoder.encode(user.getPassword()));
		user.setEnabled(true);
		userAccountRepo.save(user);
		return "redirect:/";
	}
	

}
