package com.valtx.pe.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valtx.pe.model.Producto;
import com.valtx.pe.repo.ProductoRepo;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoRepo prod;
	
	//private ProductoService productoService ;
	Producto producto;
	
	@PostMapping("/listar")
	public List<Producto> listar() {	
		return prod.findAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Producto producto) {	
		prod.save(producto);
	}
	
	@PostMapping("/actualizar")
	public void actualizar(@RequestBody Producto producto) {	
		prod.save(producto);
	}
	
	@DeleteMapping("/eliminar")
	public void eliminar(@RequestBody Producto producto) {	
	    prod.delete(producto);
	}
}
