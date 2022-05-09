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

import com.example.demo.entities.Paciente;
import com.example.demo.services.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	PacienteService pacienteService;
	
	@GetMapping()
	public List<Paciente> ListarPacientes(){
		return pacienteService.findAll();
	}
	
	@GetMapping("/{id}")
	public Paciente EncontrarPaciente(@PathVariable Long id) {
		return pacienteService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String EliminarPaciente(@PathVariable Long id) {
		String mensaje = "Paciente Eliminado";
		pacienteService.deleteById(id);
		return mensaje;
	}
	
	@PutMapping("/{id}")
	public String ModificarPaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
		String mensaje = "Paciente Modificado";
		pacienteService.modificar(id, paciente);
		return mensaje;
	}
	
}
