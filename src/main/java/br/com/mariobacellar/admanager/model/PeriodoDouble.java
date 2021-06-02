package br.com.mariobacellar.admanager.model;

import java.io.Serializable;

public class PeriodoDouble implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nome;
	private double beginDouble;
	private double endDouble;

	
	public PeriodoDouble(String unidade) {
		this.nome=unidade;
	}
	public PeriodoDouble() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getBeginDouble() {
		return beginDouble;
	}
	public void setBeginDouble(double beginDouble) {
		this.beginDouble = beginDouble;
	}
	public double getEndDouble() {
		return endDouble;
	}
	public void setEndDouble(double endDouble) {
		this.endDouble = endDouble;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String toString() {
		return getBeginDouble()+"/"+getEndDouble() +"- unidade=["+nome+"]";
	}
	
	public  boolean hasBetween(double value) {
		Double dR = new Double(value);
		Double dS = new Double(this.getBeginDouble());
		Double dE = new Double(this.getEndDouble());
		
		boolean isValueGrater = ( Double.max(dR, dS) == dR);
		boolean isValueLess   = ( Double.min(dR, dE) == dR);
		boolean hasBetween= ( isValueGrater && isValueLess );
		
		return  hasBetween;
	}
	
	
}
