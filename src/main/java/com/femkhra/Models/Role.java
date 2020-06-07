package com.femkhra.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	private String name;
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsers(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Role(String name, List<Usuario> usuarios) {
		this.name = name;
		this.usuarios = usuarios;
	}

	public Role() {
	}

	public Role(String name) {
		this.name = name;
	}

}
