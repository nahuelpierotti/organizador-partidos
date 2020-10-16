package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.CanchaFutbol;
import ar.edu.unlam.tallerweb1.modelo.Ciudad;

@Repository
@Transactional
public class RepositorioCanchaFutbolImpl implements RepositorioCanchaFutbol {
	
	@Inject
	private SessionFactory sessionfactory;

	@Override
	public void guardarCanchaFutbol(CanchaFutbol canchafutbol) {
		sessionfactory.getCurrentSession().save(canchafutbol);

	}

	@Override
	public CanchaFutbol consultatcanchaporId(Long id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(CanchaFutbol.class, id);
	}

	
	@Override
	public CanchaFutbol buscarcanchaporciudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return (CanchaFutbol) sessionfactory.getCurrentSession().createCriteria
				(CanchaFutbol.class).add(Restrictions.eq("ciudad",ciudad)).uniqueResult();
	}

}
