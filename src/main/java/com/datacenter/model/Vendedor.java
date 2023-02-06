package com.datacenter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vendedor {

	@Id
	private Integer id;
	
	@Column
	private Integer Id_vendedor;
	
	@Column
	private Integer Id_registro;
	
	@Column
	private String Nombres;
	
	@Column
	private String apellidos;
	
	@Column
	private Integer telefono;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_vendedor() {
		return Id_vendedor;
	}

	public void setId_vendedor(Integer id_vendedor) {
		Id_vendedor = id_vendedor;
	}

	public Integer getId_registro() {
		return Id_registro;
	}

	public void setId_registro(Integer id_registro) {
		Id_registro = id_registro;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
    
	
	
}
