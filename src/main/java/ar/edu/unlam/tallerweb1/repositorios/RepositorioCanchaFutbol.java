package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.CanchaFutbol;
import ar.edu.unlam.tallerweb1.modelo.Ciudad;

public interface RepositorioCanchaFutbol {
void guardarCanchaFutbol(CanchaFutbol canchafutbol);
CanchaFutbol consultatcanchaporId(Long id);
CanchaFutbol buscarcanchaporciudad(Ciudad ciudad);
}
