package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Servicio;

@Named
public class ServicioRepositorio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="demoWeb")
	private EntityManager em;
	
	public List<Servicio>findAll()throws Exception{
		List<Servicio> servicios=new ArrayList<>();
		TypedQuery<Servicio> query=em.createQuery("SELECT s From Servicio s",Servicio.class);
		servicios=query.getResultList();
		
		return servicios;
		//prueba
	}

}
