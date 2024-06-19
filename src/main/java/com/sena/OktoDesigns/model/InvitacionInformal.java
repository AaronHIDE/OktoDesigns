package com.sena.OktoDesigns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class InvitacionInformal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String saludo;
	private String introduccion;
	private String detalles;
	private String cierre;
	private String despedida;
	private String firma;
	
	@ManyToOne
	private Usuario usuario;
	
	public InvitacionInformal() {
		// TODO Auto-generated constructor stub
	}

	public InvitacionInformal(Integer id, String saludo, String introduccion, String detalles, String cierre,
			String despedida, String firma) {
		super();
		this.id = id;
		this.saludo = saludo;
		this.introduccion = introduccion;
		this.detalles = detalles;
		this.cierre = cierre;
		this.despedida = despedida;
		this.firma = firma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getCierre() {
		return cierre;
	}

	public void setCierre(String cierre) {
		this.cierre = cierre;
	}

	public String getDespedida() {
		return despedida;
	}

	public void setDespedida(String despedida) {
		this.despedida = despedida;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	@Override
	public String toString() {
		return "InvitacionInformal [id=" + id + ", saludo=" + saludo + ", introduccion=" + introduccion + ", detalles="
				+ detalles + ", cierre=" + cierre + ", despedida=" + despedida + ", firma=" + firma + "]";
	}
	
	
}
