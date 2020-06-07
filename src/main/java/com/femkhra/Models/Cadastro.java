package com.femkhra.Models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Cadastro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	@NotEmpty
	
	private String nome_empresa;
	@NotEmpty
	private String razao_empresa;
	@Email
	@NotEmpty
	private String email_empresa;
	@NotEmpty
	private String telefone;
	@NotEmpty
	private String area_medica;
	@CNPJ
	@NotEmpty
	private String cnpj;
	
	@NumberFormat
	@Column(name="numero_end",length = 5)
	@NotEmpty
	private String numero_end;
	@NotEmpty
	private String rua_end;
	@NotEmpty
	private String bairro_end;
	@NotEmpty
	private String cidade_end;
	@NotEmpty
	private String cep;
	
	@OneToMany(mappedBy="cadastro", orphanRemoval=true, cascade={CascadeType.ALL}) //deleta em cascata tanto a empresa quanto o equipamento
	private List<Equipamento> equipamentos;
	
	@ManyToOne
	@JoinColumn(name="USUARIO_EMAIL")
	private Usuario usuario;
	
	public Cadastro() {
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getRazao_empresa() {
		return razao_empresa;
	}
	public void setRazao_empresa(String razao_empresa) {
		this.razao_empresa = razao_empresa;
	}
	public String getEmail_empresa() {
		return email_empresa;
	}
	public void setEmail_empresa(String email_empresa) {
		this.email_empresa = email_empresa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getArea_medica() {
		return area_medica;
	}
	public void setArea_medica(String area_medica) {
		this.area_medica = area_medica;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNumero_end() {
		return numero_end;
	}
	public void setNumero_end(String numero_end) {
		this.numero_end = numero_end;
	}
	public String getRua_end() {
		return rua_end;
	}
	public void setRua_end(String rua_end) {
		this.rua_end = rua_end;
	}
	public String getBairro_end() {
		return bairro_end;
	}
	public void setBairro_end(String bairro_end) {
		this.bairro_end = bairro_end;
	}
	public String getCidade_end() {
		return cidade_end;
	}
	public void setCidade_end(String cidade_end) {
		this.cidade_end = cidade_end;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Cadastro(long codigo, String nome_empresa, String razao_empresa, String email_empresa, String telefone,
			String area_medica, String cnpj, String numero_end, String rua_end, String bairro_end, String cidade_end,
			String cep, List<Equipamento> equipamentos, Usuario usuario) {
		
		this.codigo = codigo;
		this.nome_empresa = nome_empresa;
		this.razao_empresa = razao_empresa;
		this.email_empresa = email_empresa;
		this.telefone = telefone;
		this.area_medica = area_medica;
		this.cnpj = cnpj;
		this.numero_end = numero_end;
		this.rua_end = rua_end;
		this.bairro_end = bairro_end;
		this.cidade_end = cidade_end;
		this.cep = cep;
		this.equipamentos = equipamentos;
		this.usuario = usuario;
	}

	public Cadastro(long codigo, String nome_empresa, String razao_empresa, String email_empresa, String telefone,
			String area_medica, String cnpj, String numero_end, String rua_end, String bairro_end, String cidade_end,
			String cep, List<Equipamento> equipamentos) {
		
		this.codigo = codigo;
		this.nome_empresa = nome_empresa;
		this.razao_empresa = razao_empresa;
		this.email_empresa = email_empresa;
		this.telefone = telefone;
		this.area_medica = area_medica;
		this.cnpj = cnpj;
		this.numero_end = numero_end;
		this.rua_end = rua_end;
		this.bairro_end = bairro_end;
		this.cidade_end = cidade_end;
		this.cep = cep;
		this.equipamentos = equipamentos;
		
	}
	

}
