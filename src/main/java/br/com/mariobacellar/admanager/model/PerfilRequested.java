package br.com.mariobacellar.admanager.model;

import java.io.Serializable;

public class PerfilRequested implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private int age;
	private double renda;
	private String uf;
	private int scoreSerasa; // vai de 0 a 1000 
	private int cep; //99999999
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public PerfilRequested() {
	}
	
	
	public PerfilRequested(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getScoreSerasa() {
		return scoreSerasa;
	}
	public void setScoreSerasa(int scoreSerasa) {
		this.scoreSerasa = scoreSerasa;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String toString() {
		return "id=["+id+"] nome=["+nome+"] - age=["+age+"] renda=["+renda+"] uf=["+uf+"] scoreSerasa=["+scoreSerasa+"] cep=["+cep+"]";
	}
	
}
