package br.com.mariobacellar.admanager.model;

import java.io.Serializable;

public class PeriodoInt  implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private int beginInt;
	
	private int endInt;

		
	public PeriodoInt(String unidade) {
		this.nome=unidade;
	}
	public PeriodoInt() {
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
	public int getBeginInt() {
		return beginInt;
	}
	public void setBeginInt(int beginInt) {
		this.beginInt = beginInt;
	}
	public int getEndInt() {
		return endInt;
	}
	public void setEndInt(int endInt) {
		this.endInt = endInt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	// Verifica se o value está compreendido no PeriodoInt
	public boolean hasBetween(int value) {
		return  (value>=this.getBeginInt() && value<=this.getEndInt()); 
	}

	public String toString() {
		return "De["+getBeginInt()+"/ Ate["+getEndInt()+"] - nome=["+nome+"]";
	}

}
