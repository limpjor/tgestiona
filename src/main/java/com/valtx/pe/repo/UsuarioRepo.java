package com.valtx.pe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtx.pe.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, String>{

}
