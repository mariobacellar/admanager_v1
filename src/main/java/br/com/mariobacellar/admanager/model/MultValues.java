package br.com.mariobacellar.admanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MultValues implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private List<String> values;
	
	public MultValues(String nome) {
		this.nome=nome;
	}
	
	public MultValues() {
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> ltValues) {
		this.values = ltValues;
	}
	
	public void addValue(String s) {
		if (this.values == null) this.values = new ArrayList<String>();
		this.values.add(s);
	}
	
	public boolean hasValue(String s) {
		if (this.values != null) 
			return this.values.contains(s);
		else
			return false;
	}
	
	public String toString() {
		return "id=["+id+"] nome=["+nome+"] - values=["+values+"]]";
	}

}
