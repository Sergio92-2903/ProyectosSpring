package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping // Encargado de mapear cual es la vista
	public String muestraPagina() {
		return "paginaEjemplo";
	}

}
