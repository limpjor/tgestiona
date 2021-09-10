package com.valtx.pe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@Column(name="cod_producto",length = 2)
	@NonNull
	private String codProducto;
	
	@Column(name="nombre",length = 50)
	@NonNull
	private String nombre;
		
	@Column(name="precio")
	@NonNull
	private Double precio;

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
	
}
