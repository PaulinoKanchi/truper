package project.api.truper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.api.truper.models.Ordenes;

public interface ComprasRepository extends JpaRepository<Ordenes,Integer>{
	
}
