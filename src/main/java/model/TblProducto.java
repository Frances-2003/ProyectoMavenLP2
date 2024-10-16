package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_producto database table.
 * 
 */
@Entity
@Table(name="tbl_producto")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;
	private String nompro;
	
	private double precio;
	private double cantidad;
	private double total;
	private String codbarras;
	private String nrolote;
	@Temporal(TemporalType.DATE)
	private Date fechaven;
	

	

	public TblProducto() {
	}

	public double getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodbarras() {
		return this.codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public Date getFechaven() {
		return this.fechaven;
	}

	public void setFechaven(Date fechaven) {
		this.fechaven = fechaven;
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	

	public String getNompro() {
		return nompro;
	}

	public void setNompro(String nompro) {
		this.nompro = nompro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNrolote() {
		return this.nrolote;
	}

	public void setNrolote(String nrolote) {
		this.nrolote = nrolote;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}