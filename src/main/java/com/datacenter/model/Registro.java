package com.datacenter.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registro {
	
	@Id
	private Integer id;
	
	@Column
	private Integer Id_registro;
	
	@Column
	private Integer Id_Recarga;
	
	@Column
	private Integer numero;
	
	@Column
	private String operador;
	
	@Column
	private Date fecha;
	
	@Column
	private Integer Id_Vendedor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_registro() {
		return Id_registro;
	}

	public void setId_registro(Integer id_registro) {
		Id_registro = id_registro;
	}

	public Integer getId_Recarga() {
		return Id_Recarga;
	}

	public void setId_Recarga(Integer id_Recarga) {
		Id_Recarga = id_Recarga;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getId_Vendedor() {
		return Id_Vendedor;
	}

	public void setId_Vendedor(Integer id_Vendedor) {
		Id_Vendedor = id_Vendedor;
	}


}
