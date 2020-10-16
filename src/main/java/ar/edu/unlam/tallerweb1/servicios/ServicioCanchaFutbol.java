package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.CanchaFutbol;
import ar.edu.unlam.tallerweb1.modelo.Ciudad;

public interface ServicioCanchaFutbol {
void guardarCanchaFutbol(CanchaFutbol canchafutbol);
CanchaFutbol mostrarCanchaFutbolPorId(Long id);
CanchaFutbol buscarcanchaporciudad(Ciudad ciudad);
}
