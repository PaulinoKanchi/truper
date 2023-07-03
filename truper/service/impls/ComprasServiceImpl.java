package project.api.truper.service.impls;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.api.truper.models.Ordenes;
import project.api.truper.models.Sucursales;
import project.api.truper.repositories.ComprasRepository;
import project.api.truper.repositories.OrdenesRepository;
import project.api.truper.service.ComprasService;

@Service
public class ComprasServiceImpl implements ComprasService{

	@Autowired
	private ComprasRepository comprasR;

	@Autowired
	private OrdenesRepository ordenR;
	
	@Override
	public Boolean guardar(Ordenes orden) {
		
		
		
		Sucursales sucursal=new Sucursales();
		sucursal.setSucursalId(1);
		
		orden.setFecha(new Date());
		orden.setSucursal_Id(sucursal);
				
		comprasR.save(orden);
		
		return true;
		
	}

}
