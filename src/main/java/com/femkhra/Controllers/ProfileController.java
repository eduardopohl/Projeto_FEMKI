package com.femkhra.Controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.femkhra.Models.Cadastro;
import com.femkhra.Models.Equipamento;
import com.femkhra.Models.Usuario;
import com.femkhra.Repositories.EmpresaRepository;
import com.femkhra.Repositories.EquipamentoRepository;
import com.femkhra.Services.TaskService;
import com.femkhra.Services.UsuarioService;

@Controller
public class ProfileController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private UsuarioService usuarioService;

	
	
	@GetMapping("/profile")
	public String showProfilePage(Model model, Principal principal) {
		String email = principal.getName();
		Usuario usuario = usuarioService.findOne(email);
		model.addAttribute("cadastros", taskService.findUsuarioTask(usuario));
		return "views/profile";
		
	}
	
	
}
