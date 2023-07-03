package project.api.truper.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Ordenes")
public class Ordenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrdenID", nullable = false)
	private Integer ordenID;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "Sucursal_Id", nullable = true)
	private Sucursales Sucursal_Id;

	@Column(name = "Fecha", nullable = false)
	private Date fecha;
	@Column(name = "Total", nullable = false)
	private Double total;

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Orden_Id")
	private List<Productos> productos;

	public Integer getOrdenID() {
		return ordenID;
	}

	public void setOrdenID(Integer ordenID) {
		this.ordenID = ordenID;
	}

	public Sucursales getSucursal_Id() {
		return Sucursal_Id;
	}

	public void setSucursal_Id(Sucursales sucursal_Id) {
		Sucursal_Id = sucursal_Id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

	public Ordenes() {
	}

	public Ordenes(Integer ordenID, Sucursales sucursal_Id, Date fecha, Double total, List<Productos> productos) {
		this.ordenID = ordenID;
		Sucursal_Id = sucursal_Id;
		this.fecha = fecha;
		this.total = total;
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Ordenes [ordenID=" + ordenID + ", Sucursal_Id=" + Sucursal_Id + ", fecha=" + fecha + ", total=" + total
				+ "]";
	}

}
