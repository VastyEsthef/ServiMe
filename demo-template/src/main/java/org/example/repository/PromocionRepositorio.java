package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Promocion;

@Named
public class PromocionRepositorio implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;

	public List<Promocion> findAll() throws Exception {
		List<Promocion> promociones = new ArrayList<>();
		TypedQuery<Promocion> query = em.createQuery("FROM Promocion p", Promocion.class);
		promociones = query.getResultList();

		return promociones;
	}

	public List<Promocion> findByName(String nombre) throws Exception {
		List<Promocion> promociones = new ArrayList<>();
		TypedQuery<Promocion> query = em.createNamedQuery("FROM Promocion p WHERE p.nombre LIKE ?1", Promocion.class);
		query.setParameter(1, "%" + nombre + "%");
		promociones = query.getResultList();

		return promociones;
	}

}
