package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Provincia;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioProvincia;
@Service
	@Transactional
public class ServicioProvinciaImpl implements ServicioProvincia {

	@Inject
	private RepositorioProvincia repositorioprovincia;
	
	
	@Override
	public Long guardarProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return repositorioprovincia.guardarProvincia(provincia);
	}

}
