package com.example.demo.services;

import java.util.List;
import com.example.demo.entities.Cita;

public interface CitaService {
	public List<Cita> findAll();
	public Cita findById(Long id);
	public void deleteById(Long id);
	public void modificar(Long id, Cita cita);
	public void agendar(Cita cita);
}
