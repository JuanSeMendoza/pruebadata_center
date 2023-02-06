package com.datacenter.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private Integer id;
	
	@Column
	private Integer Id_usuario;
	
	@Column
	private Integer Id_Recarga;

	@Column
	private String correo;
	
	@Column
	private String contraseña;

	@Column
	private Integer Id_registro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		Id_usuario = id_usuario;
	}

	public Integer getId_Recarga() {
		return Id_Recarga;
	}

	public void setId_Recarga(Integer id_Recarga) {
		Id_Recarga = id_Recarga;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Integer getId_registro() {
		return Id_registro;
	}

	public void setId_registro(Integer id_registro) {
		Id_registro = id_registro;
	}
	
}
