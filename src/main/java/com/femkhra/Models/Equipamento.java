package com.femkhra.Models;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;




@Entity
@Table(name = "equipamento")
public class Equipamento {
	@Id
	@NotEmpty
	private String numero_serie;
	@NotEmpty
	private String marca;
	@NotEmpty
	private String modelo;
	@NotEmpty
	private String dataInsercao;
	@NotEmpty
	private String tensaoMaxima;
	@NotEmpty
	private String tensaoOperacao;
	@NotEmpty
	private String caboDisparador;
	@NotEmpty
	private String contadorTempo;
	@NotEmpty
	private String formaOnda;
	@NotEmpty
	private String distanciaFoco;
	

	@ManyToOne
	private Cadastro cadastro;  
	
		
	
	public String getNumero_serie() {
		return numero_serie;
	}
	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDataInsercao() {
		return dataInsercao;
	}
	public void setDataInsercao(String dataInsercao) {
		this.dataInsercao = dataInsercao;
	

}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	public String getTensaoMaxima() {
		return tensaoMaxima;
	}
	public void setTensaoMaxima(String tensaoMaxima) {
		this.tensaoMaxima = tensaoMaxima;
	}
	public String getTensaoOperacao() {
		return tensaoOperacao;
	}
	public void setTensaoOperacao(String tensaoOperacao) {
		this.tensaoOperacao = tensaoOperacao;
	}
	public String getCaboDisparador() {
		return caboDisparador;
	}
	public void setCaboDisparador(String caboDisparador) {
		this.caboDisparador = caboDisparador;
	}
	public String getContadorTempo() {
		return contadorTempo;
	}
	public void setContadorTempo(String contadorTempo) {
		this.contadorTempo = contadorTempo;
	}
	public String getFormaOnda() {
		return formaOnda;
	}
	public void setFormaOnda(String formaOnda) {
		this.formaOnda = formaOnda;
	}
	public String getDistanciaFoco() {
		return distanciaFoco;
	}
	public void setDistanciaFoco(String distanciaFoco) {
		this.distanciaFoco = distanciaFoco;
	}


	
}