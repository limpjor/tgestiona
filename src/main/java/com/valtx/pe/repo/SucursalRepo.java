package com.valtx.pe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtx.pe.model.Sucursal;

@Repository
public interface SucursalRepo extends JpaRepository<Sucursal, String>{

}
