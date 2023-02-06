package com.datacenter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Operadores {
	
	@Id
	private Integer id;

	@Column
	private Integer Id_Recarga;
	
	@Column
	private String operador;
	
	@Column
	private Integer numero;

	@Column
	private Integer valor;

	@Column
	private Integer Id_registro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_Recarga() {
		return Id_Recarga;
	}

	public void setId_Recarga(Integer id_Recarga) {
		Id_Recarga = id_Recarga;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getId_registro() {
		return Id_registro;
	}

	public void setId_registro(Integer id_registro) {
		Id_registro = id_registro;
	}
}
