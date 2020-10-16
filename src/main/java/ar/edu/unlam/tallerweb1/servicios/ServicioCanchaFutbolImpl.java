package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.CanchaFutbol;
import ar.edu.unlam.tallerweb1.modelo.Ciudad;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioCanchaFutbol;
@Service("servicioCanchaFutbol")
@Transactional
public class ServicioCanchaFutbolImpl implements ServicioCanchaFutbol {
	@Inject
	private RepositorioCanchaFutbol repositoriocanchafutbol;

	@Override
	public void guardarCanchaFutbol(CanchaFutbol canchafutbol) {
		repositoriocanchafutbol.guardarCanchaFutbol(canchafutbol);
		// TODO Auto-generated method stub

	}

	@Override
	public CanchaFutbol mostrarCanchaFutbolPorId(Long id) {
		CanchaFutbol canchafutbol =repositoriocanchafutbol.consultatcanchaporId(id);
		return canchafutbol;
	}

	@Override
	public CanchaFutbol buscarcanchaporciudad(Ciudad ciudad) {
		CanchaFutbol canchafutbol= repositoriocanchafutbol.buscarcanchaporciudad(ciudad);
		return canchafutbol;
	}

}
