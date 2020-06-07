package com.femkhra.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Email
	@NotEmpty
	@Column(unique = true)
	private String email;
	@NotEmpty
	private String name;
	@Size(min = 4)
	private String password;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Cadastro> cadastros;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USUARIO_ROLES", joinColumns={
			@JoinColumn(name = "USUARIO_EMAIL", referencedColumnName = "email") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name") })
	private List<Role> roles;
	
	

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Cadastro> getcadastros() {
		return cadastros;
	}

	public void setcadastros(List<Cadastro> cadastros) {
		this.cadastros = cadastros;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Usuario(String email, String name, String password) {
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public Usuario() {

	}

	public String getEmail() {
		return email;
	}

	
}
