package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Ciudad;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioCiudad;

@Service
@Transactional
public class ServicioCiudadImpl implements ServicioCiudad {

	
	@Inject
	private RepositorioCiudad repositoriociudad;
	@Override
	public Long guardarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return repositoriociudad.guardarCiudad(ciudad);
	}

}
