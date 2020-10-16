package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Direccion;

@Repository
public class RepositorioDireccionImpl implements RepositorioDireccion {

	@Inject
	private SessionFactory sessionFactory;
	@Override
	public Long guardarDireccion(Direccion direccion) {
		Session session=	sessionFactory.getCurrentSession();
		return(Long)	session.save(direccion);
	}

}
