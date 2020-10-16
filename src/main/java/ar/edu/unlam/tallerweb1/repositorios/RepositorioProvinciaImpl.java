package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Provincia;

@Repository
public class RepositorioProvinciaImpl implements RepositorioProvincia {

	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public Long guardarProvincia(Provincia provincia) {
		Session session=	sessionFactory.getCurrentSession();
		return(Long)	session.save(provincia);
	
	}

}
