package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.entities.Servicio;
import org.example.repository.ServicioRepositorio;

@Named
public class ServicioBusiness implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ServicioRepositorio servicioRepositorio;

	public List<Servicio> getAll() throws Exception {
		return servicioRepositorio.findAll();
	}

	public List<Servicio> getServiciosByName(String nombre) throws Exception {
		return servicioRepositorio.findByName(nombre);
	}

}
