package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CitaDao;
import com.example.demo.entities.Cita;

@Service
public class CitaServiceImpl implements CitaService{

	@Autowired
	CitaDao citaDao;
	
	@Override
	public List<Cita> findAll() {
		return (List<Cita>) citaDao.findAll();
	}

	@Override
	public Cita findById(Long id) {
		return citaDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		if(citaDao.existsById(id)){
			citaDao.deleteById(id);
		}
	}

	@Override
	public void modificar(Long id, Cita cita) {
		if(citaDao.existsById(id)){
			cita.setId(id);
			citaDao.save(cita);
		}	
	}

	@Override
	public void agendar(Cita cita) {
		citaDao.save(cita);
	}

}
