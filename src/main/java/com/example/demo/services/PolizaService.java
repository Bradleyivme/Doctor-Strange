package com.example.demo.services;

import java.util.List;
import com.example.demo.entities.Poliza;

public interface PolizaService {
	public List<Poliza> findAll();
	public Poliza findById(Long id);
	public void deleteById(Long id);
	public void modificar(Long id, Poliza poliza);
}
