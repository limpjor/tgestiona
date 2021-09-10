package com.valtx.pe.model;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_sucursal",length = 2)
	private String codSucursal;
	
	@Column(name="nombre",length = 50)
	private String nombre;

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sucursal")
	@JsonManagedReference
	Set <Usuario> usuario = new HashSet<>();*/
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_sucursal", referencedColumnName = "cod_sucursal", foreignKey = @ForeignKey(name="fk_sucursal"),insertable = false, updatable = false)
	@JsonBackReference
	private Usuario usuario;
	
	public String getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(String codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
