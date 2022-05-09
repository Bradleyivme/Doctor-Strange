package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.PolizaDao;
import com.example.demo.entities.Poliza;

@Service
public class PolizaServiceImpl implements PolizaService{

	@Autowired
	PolizaDao polizaDao;
	
	@Override
	public List<Poliza> findAll() {
		return (List<Poliza>) polizaDao.findAll();
	}

	@Override
	public Poliza findById(Long id) {
		return polizaDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		if(polizaDao.existsById(id)){
			polizaDao.deleteById(id);
		}
		
	}

	@Override
	public void modificar(Long id, Poliza poliza) {
		if(polizaDao.existsById(id)){
			poliza.setId(id);
			polizaDao.save(poliza);
		}
	}

}
