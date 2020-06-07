package com.femkhra.Controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.femkhra.Models.Cadastro;
import com.femkhra.Models.Equipamento;
import com.femkhra.Models.Usuario;
import com.femkhra.Repositories.EmpresaRepository;
import com.femkhra.Repositories.EquipamentoRepository;

@Controller
public class EmpresaController {

	@Autowired
	private EmpresaRepository er;

	@Autowired
	private EquipamentoRepository eR;

	
	@GetMapping("/cadastrarEmpresa")
	public String FormEmpresa(Model model) {
		model.addAttribute("cadastro", new Cadastro());
		return "cadastro/formCadastro";
	}



	@RequestMapping("/cadastros")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cadastro> cadastros = er.findAll();
		mv.addObject("cadastros", cadastros);
		return mv;

	}
	@RequestMapping("/lista")
	public ModelAndView listaEmpresas() {
		ModelAndView mv = new ModelAndView("cadastro/lista");
		Iterable<Cadastro> cadastros = er.findAll();
		mv.addObject("cadastros", cadastros);
		return mv;

	}
	
	@PutMapping()
	@GetMapping("/detalhes")
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public ModelAndView detalhesEmpresa(@PathVariable("codigo") long codigo) {
		Cadastro cadastro = er.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("cadastro/detalhes");
		mv.addObject("cadastro", cadastro);
		Iterable<Equipamento> equipamentos = eR.findByCadastro(cadastro);
		mv.addObject("equipamentos", equipamentos);
		return mv;

	}
	

	
	
	
	@RequestMapping("/deletar")
	public String deletarEmpresa(long codigo) {
		Cadastro cadastro = er.findByCodigo(codigo);
		er.delete(cadastro);
		return "redirect:/lista";
	}
	

	
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.POST)
	public String saveEquipamento(@PathVariable("codigo") long codigo, @Valid Equipamento equipamento,
			BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/{codigo}";
		}
		Cadastro cadastro = er.findByCodigo(codigo);
		equipamento.setCadastro(cadastro);
		eR.save(equipamento);
		attributes.addFlashAttribute("mensagem", "Equipamento Adicionado!");
		return "redirect:/{codigo}";

	}
	

		

}
