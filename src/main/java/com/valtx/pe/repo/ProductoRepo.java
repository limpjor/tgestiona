package com.valtx.pe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtx.pe.model.Producto;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, String> {
	
}
