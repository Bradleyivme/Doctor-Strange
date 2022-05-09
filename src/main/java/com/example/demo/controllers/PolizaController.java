package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Poliza;
import com.example.demo.services.PolizaService;

@RestController
@RequestMapping("/polizas")
public class PolizaController {
	
	@Autowired
	PolizaService polizaService;
	
	@GetMapping()
	public List<Poliza> ListarPolizas(){
		return polizaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Poliza EncontrarPoliza(@PathVariable Long id) {
		return polizaService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String EliminarPoliza(@PathVariable Long id) {
		String mensaje = "Poliza Eliminado";
		polizaService.deleteById(id);
		return mensaje;
	}
	
	@PutMapping("/{id}")
	public String ModificarPoliza(@PathVariable Long id, @RequestBody Poliza poliza) {
		String mensaje = "Poliza Modificado";
		polizaService.modificar(id, poliza);
		return mensaje;
	}
	
	
}
