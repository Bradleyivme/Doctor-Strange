package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Paciente;

public interface PacienteDao extends CrudRepository<Paciente, Long> {

}
