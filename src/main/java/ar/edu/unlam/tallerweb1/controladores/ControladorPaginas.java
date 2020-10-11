package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.CanchaFutbol;
//import ar.edu.unlam.tallerweb1.servicios.ServicioCanchaFutbol;

@Controller
public class ControladorPaginas {
/*@Inject
private ServicioCanchaFutbol serviciocanchafutbol;*/

@RequestMapping("mostrarcanchasfutbol")
public ModelAndView mostrarcanchas() 
{
	CanchaFutbol canchafutbol=new CanchaFutbol();
	canchafutbol.setNombre("LaQuemita");
	//serviciocanchafutbol.guardarCanchaFutbol(canchafutbol);
	ModelMap modelo = new ModelMap();
	//modelo.put paso los datos
	modelo.put("canchafutbol",modelo);
	
	
	return new ModelAndView("canchafutbol",modelo);
}

}
