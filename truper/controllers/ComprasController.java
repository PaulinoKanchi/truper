package project.api.truper.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.api.truper.models.Ordenes;
import project.api.truper.models.Sucursales;
import project.api.truper.service.impls.ComprasServiceImpl;

@RestController
@RequestMapping("/Ventas")
public class ComprasController {

	@Autowired
	private ComprasServiceImpl compras;

	@PostMapping("/Guardar")
	public Boolean obtenerDias() {
		
		
		List<String> diasSem=new ArrayList<String>();
		diasSem.add("Lunes");
		diasSem.add("Martes");
		diasSem.add("Miercoles");
		diasSem.add("Jueves");
		diasSem.add("Viernes");
		diasSem.add("Sabado");
		diasSem.add("Domingo");
		for(int i=0;i<diasSem.size();i++) {
			System.out.println("Dia: " + diasSem.get(i));
		}
		
		
		
		
		return true;

	}

}
