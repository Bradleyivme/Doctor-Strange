package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cita;
import com.example.demo.services.CitaService;

@RestController
@RequestMapping("/citas")
public class CitaController {
	@Autowired
	CitaService citaService;
	
	@GetMapping()
	public List<Cita> ListarPolizas(){
		return citaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Cita EncontrarCita(@PathVariable Long id) {
		return citaService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String EliminarCita(@PathVariable Long id) {
		String mensaje = "Cita Eliminado";
		citaService.deleteById(id);
		return mensaje;
	}
	
	@PutMapping("/{id}")
	public String ModificarCita(@PathVariable Long id, @RequestBody Cita cita) {
		String mensaje = "Cita Modificado";
		citaService.modificar(id, cita);
		return mensaje;
	}
	
	@PostMapping()
	public String AgendarCita(@RequestBody Cita cita) {
		String mensaje = "Cita agendada";
		citaService.agendar(cita);
		return mensaje;
	}
}
