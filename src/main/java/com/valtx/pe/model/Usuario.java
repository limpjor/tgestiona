package com.valtx.pe.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cod_usuario",length = 2)
	private String codUsuario;
	
	@Column(name="nombre",length = 50)
	private String nombre;
	
	@Column(name="user",length = 50)
	private String user;
	
	@Column(name="password",length = 50)
	private String password;
	
	@Column(name="cod_sucursal",length = 2)
	private String codSucursal;
	
	/*@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_sucursal", referencedColumnName = "cod_sucursal", foreignKey = @ForeignKey(name="fk_sucursal"),insertable = false, updatable = false)
	@JsonBackReference
	private Sucursal sucursal;*/
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
	@JsonManagedReference
	Set <Sucursal> sucursal = new HashSet<>();
	
	public String getCodUsuario() {
		return codUsuario;
	}
	
	
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUse() {
		return user;
	}

	public void setUse(String use) {
		this.user = use;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(String codSucursal) {
		this.codSucursal = codSucursal;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public Set<Sucursal> getSucursal() {
		return sucursal;
	}


	public void setSucursal(Set<Sucursal> sucursal) {
		this.sucursal = sucursal;
	}

}
