package com.datacenter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tbl_Operador {
	@Id
	private Integer id_operador;

	@Column
	private String nombre;
	
	@Column
	private Boolean afiliado;


	public Integer getId_operador() {
		return id_operador;
	}

	public void setId_operador(Integer id_operador) {
		this.id_operador = id_operador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Boolean afiliado) {
		this.afiliado = afiliado;
	}
	
}
