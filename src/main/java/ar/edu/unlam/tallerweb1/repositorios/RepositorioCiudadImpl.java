package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Ciudad;
import ar.edu.unlam.tallerweb1.modelo.Provincia;
@Repository
public class RepositorioCiudadImpl implements RepositorioCiudad {
	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public Long guardarCiudad(Ciudad ciudad) {
		Session session=	sessionFactory.getCurrentSession();
		return(Long)	session.save(ciudad);
	
	}

}
