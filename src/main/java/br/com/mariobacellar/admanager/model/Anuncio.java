package br.com.mariobacellar.admanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Anuncio implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private String url;
	
	private List<Perfil> perfis;
	
	public Anuncio(String  nome, String url){
		this.nome=nome;
		this.url=url;
	}
	
	public Anuncio() {
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}
	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}	
	public void addPerfil(Perfil p) {
		if (this.perfis==null) this.perfis= new ArrayList<Perfil>();
		this.perfis.add(p);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("nome=["+this.nome+"] - url=["+this.url+"] - perfis=[");
		for (Perfil perfil : perfis)  sb.append(perfil);
		return sb.toString();
	}
	
}
