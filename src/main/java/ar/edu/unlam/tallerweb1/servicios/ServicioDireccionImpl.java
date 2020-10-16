package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioDireccion;

@Service
@Transactional
public class ServicioDireccionImpl implements ServicioDireccion {

	@Inject
	private RepositorioDireccion repositoriodireccion;
	@Override
	public Long guardarDireccion(Direccion direccion) {
		return repositoriodireccion.guardarDireccion(direccion);
		
	}

}
