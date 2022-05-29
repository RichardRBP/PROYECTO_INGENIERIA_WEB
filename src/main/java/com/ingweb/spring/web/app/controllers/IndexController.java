package com.ingweb.spring.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
<<<<<<< HEAD
	
	@GetMapping({"/index","/","/home"}) 
	public String index(Model model) {
		model.addAttribute("titulo","PROYECTO INGENIERIA WEB");
		return "index";
	}
	
=======
	//Llego luchito 
>>>>>>> aa013ed2be0cd4db6dc1e6c1cc620e367b1108dd
}
