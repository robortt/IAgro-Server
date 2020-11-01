package com.persistence;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.entities.Usuario;

/**
 * Session Bean implementation class UsuarioDao
 */
@Singleton
<<<<<<< HEAD
public class UsuarioDao implements IDao<Usuario>, UsuarioDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

=======
public class UsuarioDao implements UsuarioDaoLocal {
>>>>>>> 6b094b61d92fdf292d1cf2d3811660efba35fc09

    /**
     * Default constructor. 
     */
    public UsuarioDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Usuario o){
		try {
			em.persist(o);
			em.flush();
			
		} catch (PersistenceException e) {
		
		}
		
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
