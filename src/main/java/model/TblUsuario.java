package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuario database table.
 * 
 */
@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private String clave;
	 @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idestudiante;

	private String usuario;

	public TblUsuario() {
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getIdestudiante() {
		return this.idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}