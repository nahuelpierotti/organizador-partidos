package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.CanchaFutbol;
import ar.edu.unlam.tallerweb1.modelo.Ciudad;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Provincia;
import ar.edu.unlam.tallerweb1.servicios.ServicioCiudad;
import ar.edu.unlam.tallerweb1.servicios.ServicioProvincia;
import ar.edu.unlam.tallerweb1.servicios.ServicioCanchaFutbol;

@Controller
public class ControladorPaginas {
@Inject
private ServicioCanchaFutbol serviciocanchafutbol;
@Inject
private ServicioCiudad serviciociudad;


@RequestMapping(path="/mostrarcanchasfutbol",method=RequestMethod.GET)
public ModelAndView mostrarcanchas(@RequestParam(value="nombre",required=false)String nombre
		) 
{
	
	Ciudad ciudad = new Ciudad();
	
	
	
	Long id_Ciudad;
	String ci= "asdasd";
	ciudad.setNombre("ciudad20");
	
	id_Ciudad= serviciociudad.guardarCiudad(ciudad);
	CanchaFutbol canchafutbol=new CanchaFutbol();
	CanchaFutbol canchafutbolbuscada=new CanchaFutbol();
	canchafutbol.setNombre("LaQuemita");
	serviciocanchafutbol.guardarCanchaFutbol(canchafutbol);
	/*canchafutbolbuscada= serviciocanchafutbol.buscarcanchaporciudad(ciudad);
	String nombrecan = canchafutbolbuscada.getNombre();*/

	ModelMap modelo = new ModelMap();
	modelo.put("canchafutbol",modelo);
	modelo.put("ciudad",ci );
	modelo.put("ciudades",ci);
	//modelo.put("canchas",nombrecan);
	
	return new ModelAndView("canchafutbol",modelo);
}

}
