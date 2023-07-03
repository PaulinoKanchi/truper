package project.api.truper.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Productos_ID", nullable = false)
	private Integer productosID;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "Orden_Id", nullable = true)
	private Ordenes Orden_Id;

	@Column(name = "Codigo", length = 20, nullable = false)
	private String codigo;

	@Column(name = "Descripcion", length = 20, nullable = false)
	private String descripcion;

	@Column(name = "Precio", nullable = false)
	private Double precio;

	public Integer getProductosID() {
		return productosID;
	}

	public void setProductosID(Integer productosID) {
		this.productosID = productosID;
	}

	public Ordenes getOrden_Id() {
		return Orden_Id;
	}

	public void setOrden_Id(Ordenes orden_Id) {
		Orden_Id = orden_Id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Productos(Integer productosID, Ordenes orden_Id, String codigo, String descripcion, Double precio) {
		this.productosID = productosID;
		Orden_Id = orden_Id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [productosID=" + productosID + ", Orden_Id=" + Orden_Id + ", codigo=" + codigo
				+ ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

}
