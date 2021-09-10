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

import com.valtx.pe.model.Sucursal;
import com.valtx.pe.repo.SucursalRepo;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/sucursal")
public class SucursalController {
	
	@Autowired
	SucursalRepo sucursalRepo;
	
	Sucursal sucursal;
	
	@PostMapping("/listar")
	public List<Sucursal> listar() {	
		return sucursalRepo.findAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Sucursal sucursal) {	
		sucursalRepo.save(sucursal);
	}
	
	@PostMapping("/actualizar")
	public void actualizar(@RequestBody Sucursal sucursal) {	
		sucursalRepo.save(sucursal);
	}
	
	@DeleteMapping("/eliminar")
	public void eliminar(@RequestBody Sucursal sucursal) {	
		sucursalRepo.delete(sucursal);
	}
}
