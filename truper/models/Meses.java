package project.api.truper.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.api.truper.controllers.ComprasController;
import project.api.truper.service.impls.ComprasServiceImpl;
@RestController
@RequestMapping("/Meses")
public class Meses {

	@Autowired
	private ComprasController diasSemana;

	@PostMapping("/Consultar")
	public void consultarMeses() {
		diasSemana.obtenerDias();
	}
	
}
