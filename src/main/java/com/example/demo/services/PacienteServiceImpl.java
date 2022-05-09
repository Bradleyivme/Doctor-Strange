package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CitaDao;
import com.example.demo.Dao.PacienteDao;
import com.example.demo.Dao.PolizaDao;
import com.example.demo.entities.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{

	@Autowired
	PacienteDao pacienteDao;

	@Autowired
	PolizaDao polizaDao;
	
	@Autowired
	CitaDao citaDao;
	
	
	@Override
	public List<Paciente> findAll() {
		return (List<Paciente>) pacienteDao.findAll();
	}

	@Override
	public Paciente findById(Long id) {
		return pacienteDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		if(pacienteDao.existsById(id)){
			pacienteDao.deleteById(id);
		}
		if(polizaDao.existsById(id)) {
			polizaDao.deleteById(id);;
		}
		if(citaDao.existsById(id)) {
			citaDao.deleteById(id);;
		}
	}

	@Override
	public void modificar(Long id, Paciente paciente) {
		if(pacienteDao.existsById(id)){
			paciente.setId(id);
			pacienteDao.save(paciente);
		}
		
	}
	
	

}
