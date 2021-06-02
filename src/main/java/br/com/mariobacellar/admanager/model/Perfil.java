package br.com.mariobacellar.admanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Perfil implements Serializable{

	private static final long serialVersionUID = 1L;

    private Long id;
	
	private String nome;

	private PeriodoInt age;
	
	private PeriodoDouble renda;

	private MultValues ufs;

	private PeriodoInt scoreSerasa; // vai de 0 a 1000 
	
	private PeriodoInt cep; //99999999
 
	public Perfil(String nome) {
		this.nome=nome;
	}
	
	public Perfil() {
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
	
	// Age
	public PeriodoInt	getAge() { return age; }
	public void 		setAge(PeriodoInt age) { this.age = age;}
	public void 		setAge(String age) { 
		// @param renda - ex: "18/29"
		String[] splited=age.split("/");
		PeriodoInt 
		setAge = new PeriodoInt("Idade");
		setAge.setBeginInt( Integer.parseInt( splited[0] ) );
		setAge.setEndInt( Integer.parseInt( splited[1] ));
		this.age = setAge;
	}	
	
	// Renda
	public PeriodoDouble	getRenda() 						{ return renda; 		}
	public void				setRenda(PeriodoDouble renda)	{ this.renda = renda;	 }
	public void 			setRenda(String renda) {
		// @param renda - ex: "10123.98/29999.99"
		String[] splited=renda.split("/");
		PeriodoDouble 
		setRenda = new PeriodoDouble("Renda Mensal");
		setRenda.setBeginDouble( Double.valueOf(splited[0]) );
		setRenda.setEndDouble ( Double.valueOf(splited[1]) );
		this.renda = setRenda;
	}


	// UF
	public MultValues	getUfs() 				{ return ufs; 		}
	public void			setUfs(MultValues ufs)	{ this.ufs = ufs;	}
	public void			setUfs(String ufs)		{  
		this.ufs = new MultValues("UF");
		String[] splitedUfs=ufs.split("/");
		ArrayList<String> list1 =  new ArrayList<String>(Arrays.asList(splitedUfs));
		this.ufs.setValues(list1);
	}
	public void 		setUf (String uf) 		{
		if (this.ufs == null) this.ufs = new MultValues("UF");
		this.ufs.addValue(uf);
	}
	
	
	//scoreSerasa
	public PeriodoInt	getScoreSerasa() { return scoreSerasa;	}
	public void				setScoreSerasa(PeriodoInt scoreSerasa) { this.scoreSerasa = scoreSerasa; }
	public void				setScoresSerasa(String scoreSerasa)		{  
		// @param renda - ex: "18/29"
		String[] splited=scoreSerasa.split("/");
		PeriodoInt 
		setScoreSerasa = new PeriodoInt("Score Serasa");
		setScoreSerasa.setBeginInt( Integer.parseInt( splited[0] ) );
		setScoreSerasa.setEndInt ( Integer.parseInt( splited[1] ));
		this.scoreSerasa = setScoreSerasa;
	}
 	
	// cep
	public PeriodoInt 	getCep() { return cep; }
	public void 			setCep(PeriodoInt cep) { this.cep = cep; }
	public void				setCep(String cep)		{  
		// @param renda - ex: "18/29"
		String[] splited=cep.split("/");
		PeriodoInt 
		setCep = new PeriodoInt("Score Serasa");
		setCep.setBeginInt( Integer.parseInt( splited[0] ) );
		setCep.setEndInt  ( Integer.parseInt( splited[1] ));
		this.cep = setCep;
	}
	
	
	// Verifica se o PerfilRequested está compreendido no perfilAnuncio
	public boolean thus (PerfilRequested perfilRequested) {
		//Testing PeriodoInt age;
		boolean tstAge		= ( this.age==null || this.age.hasBetween(perfilRequested.getAge() ) );
		
		//Testing PeriodoDouble renda;
		boolean tstRenda	= ( this.renda==null || this.renda.hasBetween(perfilRequested.getRenda() ) );

		//Testing MultValues ufs;
		boolean tstUfs		= ( this.ufs==null || this.ufs.getValues().contains("BR") || this.ufs.hasValue(perfilRequested.getUf()));

		//Testing PeriodoInt Score Serasa;
		boolean tstScoreSerasa= ( this.scoreSerasa==null || this.scoreSerasa.hasBetween(perfilRequested.getScoreSerasa() ) );

		//Testing PeriodoInt cep;
		boolean tstCep		= ( this.cep==null || this.cep.hasBetween(perfilRequested.getCep() ) );

		
		return (tstAge && tstRenda && tstUfs && tstScoreSerasa && tstCep);
	}
	

	public String toString() {
		return "id=["+id+"] nome=["+nome+"] - age=["+age+"] renda=["+renda+"] uf=["+ufs+"] scoreSerasa=["+scoreSerasa+"] cep=["+cep+"]";
	}
}
