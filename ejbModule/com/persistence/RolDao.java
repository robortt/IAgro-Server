package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.entities.Rol;

/**
 * Session Bean implementation class RolDao
 */
@Singleton
public class RolDao implements RolDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public RolDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean create(Rol o) {
		
		try {
			em.persist(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
	}

	@Override
	public Rol read(Long id) {
		TypedQuery<Rol> query = em.createNamedQuery("Rol.readfuncionalidades",Rol.class);
		query.setParameter("id", id);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
	}

	@Override
	public List<Rol> readAll() {
		TypedQuery<Rol> query = em.createNamedQuery("Rol.readAll", Rol.class);
		return query.getResultList();
	}

	@Override
	public boolean update(Rol o) {
		try {
			em.merge(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
		
	}

	@Override
	public boolean delete(Long id) {
		try {
			Rol o = em.find(Rol.class, id);
			em.remove(o);
			em.flush();
			return true;
		} catch (PersistenceException e) {
			e.getMessage();
			return false;
		}
		
		
	}

}
