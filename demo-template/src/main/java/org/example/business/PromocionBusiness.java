package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.entities.Promocion;
import org.example.repository.PromocionRepositorio;

@Named
public class PromocionBusiness implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private PromocionRepositorio promocionRepositorio;

	public List<Promocion> getAll() throws Exception {
		return promocionRepositorio.findAll();
	}

	public List<Promocion> getPromocionesByName(String nombre) throws Exception {
		return promocionRepositorio.findByName(nombre);
	}

}
