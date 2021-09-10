package com.valtx.pe.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valtx.pe.model.Usuario;
import com.valtx.pe.repo.UsuarioRepo;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepo usuarioRepo;
	
	Usuario sucursal;
	
	@PostMapping("/listar")
	public List<Usuario> listar() {	
		return usuarioRepo.findAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Usuario usuario) {	
		usuarioRepo.save(usuario);
	}
	
	@PostMapping("/actualizar")
	public void actualizar(@RequestBody Usuario usuario) {	
		usuarioRepo.save(usuario);
	}
	
	@DeleteMapping("/eliminar")
	public void eliminar(@RequestBody Usuario usuario) {	
		usuarioRepo.delete(usuario);
	}
}
