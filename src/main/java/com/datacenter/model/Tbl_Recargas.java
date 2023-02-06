package com.datacenter.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tbl_Recargas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_recarga;

	@Column
	private Integer fk_id_operador;
	
	@Column
	private Integer valor;
	
	@Column
	private String usuario;

	@Column
	private Integer fk_id_vendedor;

	@Column
	private Date fecha;


	public Integer getId_recarga() {
		return id_recarga;
	}

	public void setId_recarga(Integer id_recarga) {
		this.id_recarga = id_recarga;
	}

	public Integer getFk_id_operador() {
		return fk_id_operador;
	}

	public void setFk_id_operador(Integer fk_id_operador) {
		this.fk_id_operador = fk_id_operador;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getFk_id_vendedor() {
		return fk_id_vendedor;
	}

	public void setFk_id_vendedor(Integer fk_id_vendedor) {
		this.fk_id_vendedor = fk_id_vendedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
