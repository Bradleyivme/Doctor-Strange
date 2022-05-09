package com.example.demo.services;

import java.util.List;
import com.example.demo.entities.Paciente;

public interface PacienteService {
	public List<Paciente> findAll();
	public Paciente findById(Long id);
	public void deleteById(Long id);
	public void modificar(Long id, Paciente paciente);
}
