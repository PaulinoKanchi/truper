package project.api.truper.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Sucursales")
public class Sucursales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sucursal_Id", nullable = false)
	private Integer sucursalId;

	@Column(name = "Nombre", length = 50, nullable = false)
	private String nombre;

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Sucursal_Id")
	private List<Ordenes> orden;

	public Integer getSucursalId() {
		return sucursalId;
	}

	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ordenes> getOrden() {
		return orden;
	}

	public void setOrden(List<Ordenes> orden) {
		this.orden = orden;
	}

	public Sucursales() {
	}

	public Sucursales(Integer sucursalId, String nombre, List<Ordenes> orden) {
		this.sucursalId = sucursalId;
		this.nombre = nombre;
		this.orden = orden;
	}

}
