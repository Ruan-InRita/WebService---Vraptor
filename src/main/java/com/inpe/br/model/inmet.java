package com.inpe.br.model;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;


public class inmet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idpcd;
	private Date datahora;
	private Long idsensor;
	private double valor;
	private String valido;
	
	public inmet() {
	}

	
	
	public inmet(Long idpcd, Date datahora, Long idsensor, double valor, String valido) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.idpcd = idpcd;
		this.datahora = datahora;
		this.idsensor = idsensor;
		this.valor = valor;
		this.valido = valido;
	}



	public Long getIdpcd() {
		return idpcd;
	}

	public void setIdpcd(Long idpcd) {
		this.idpcd = idpcd;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	public Long getIdsensor() {
		return idsensor;
	}

	public void setIdsensor(Long idsensor) {
		this.idsensor = idsensor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getValido() {
		return valido;
	}

	public void setValido(String valido) {
		this.valido = valido;
	}


	@Override
	public String toString() {
		return "idpcd=" + idpcd + ", datahora=" + datahora + ", idsensor=" + idsensor + ", valor=" + valor
				+ ", valido=" + valido ;
	}


	
	
	
	
	
	
}
