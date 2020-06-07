package com.femkhra.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.femkhra.Models.Equipamento;
import com.femkhra.Models.Role;
import com.femkhra.Models.Usuario;
import com.femkhra.Repositories.EquipamentoRepository;
import com.femkhra.Repositories.UserRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EquipamentoRepository equipamentoRepository;
	
	public void createUser(Usuario usuario) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		usuario.setPassword(encoder.encode(usuario.getPassword())); 
		Role usuarioRole = new Role("USUARIO");
		List<Role> roles = new ArrayList<>();
		roles.add(usuarioRole);
		usuario.setRoles(roles);
		userRepository.save(usuario);
	}
	
	public void createAdmin(Usuario usuario) {
		BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
		usuario.setPassword(encoder.encode(usuario.getPassword())); 
		Role usuarioRole = new Role("ADMIN");
		List<Role> roles = new ArrayList<>();
		roles.add(usuarioRole);
		usuario.setRoles(roles);
		userRepository.save(usuario);
	}
	
	public Usuario findOne(String email) {
		
	  return userRepository.findOne(email);
	}
	
	public Equipamento findEquip(String numero_serie) {
		
		  return equipamentoRepository.findOne(numero_serie);
		}

	public boolean isUserPresent(String email) {
		// TODO Auto-generated method stub
		Usuario u=userRepository.findOne(email);
		if(u!=null)
			return true;
		
		return false;
	}

	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public List<Usuario> findByName(String name) {
		// TODO Auto-generated method stub
		return  userRepository.findByNameLike("%"+name+"%");
	}

}
