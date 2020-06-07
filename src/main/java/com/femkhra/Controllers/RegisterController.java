package com.femkhra.Controllers;

import javax.validation.Valid;

import com.femkhra.Models.Usuario;
import com.femkhra.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/register")
	public String registerForm(Model model) {

		model.addAttribute("user", new Usuario());
		return "views/registerForm";
	}
	
	
	@PostMapping("/register")
    public String registerUser(@Valid Usuario usuario, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "views/registerForm";
		}
		if(usuarioService.isUserPresent(usuario.getEmail())) {
			model.addAttribute("exist",true);

			return "views/registerForm";

		}
		usuarioService.createUser(usuario);
		
		return "views/success";

	}

}
