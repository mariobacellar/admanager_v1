package br.com.mariobacellar.admanager.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.ArrayList;

import br.com.mariobacellar.admanager.model.Anuncio;
import br.com.mariobacellar.admanager.model.MultValues;
import br.com.mariobacellar.admanager.model.Perfil;
import br.com.mariobacellar.admanager.model.PeriodoDouble;
import br.com.mariobacellar.admanager.model.PeriodoInt;

public class Util {

	public static File[] getFiles(String folder) {
		File fileInFolder = new File(folder);
		FileFilter fileFileFilter = new FileFilter() {
			public boolean accept(File file) {
				return !file.isDirectory();
			}
		};
		File[] fileListAsFile = fileInFolder.listFiles(fileFileFilter);
		return fileListAsFile ;	
	}
	
	public static String[] doReadLines(File fileCSV) throws Exception {
		ArrayList<String> lt = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileCSV))) {
			String line = br.readLine();
			while (line != null) {
				lt.add(line);
				line = br.readLine();
			}
		}
		String[] ret = lt.stream().toArray(String[]::new);
		return ret;
	}
	
	public static String convert2String(String[] stringArray) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < stringArray.length; i++) sb.append(stringArray[i]);
		String str = sb.toString();
		return str;
	}
	
	public static ArrayList<Anuncio> buildAnunciosFake() {
		
		////////////////////////////////////////////////////////////////////////
		// Criando Perfis de Anuncios
		////////////////////////////////////////////////////////////////////////
		Perfil 
		pJoven18_29_RJ	= new Perfil("Joven18_29");
		pJoven18_29_RJ.setAge("18/29");
		pJoven18_29_RJ.setRenda("1000.00/4999.99");
		pJoven18_29_RJ.setUf("RJ");
		
		Perfil 
		pJoven18_29_SP	= new Perfil("Joven18_29");
		pJoven18_29_SP.setAge("18/29");
		pJoven18_29_SP.setRenda("1000.00/4999.99");
		pJoven18_29_SP.setUfs("SP/BR");

		
		Perfil 
		pAdulto30_39	= new Perfil("Adulto30_39");
		pAdulto30_39.setAge("30/39");
		pAdulto30_39.setRenda("11000.00/14999.99");
		pAdulto30_39.setUf("SP");
		
		Perfil 
		pSenhores40_49 = new Perfil("Senhores40_49");
		pSenhores40_49.setAge("40/49");
		pSenhores40_49.setRenda("21000.00/24999.99");
		pSenhores40_49.setUf("BR");

		Perfil 
		pTodos = new Perfil("Todos");
		pTodos.setAge	((PeriodoInt)	null);
		pTodos.setRenda	((PeriodoDouble)	null);
		pTodos.setUfs	((MultValues)	null);

		////////////////////////////////////////////////////////////////////////
		
		
		////////////////////////////////////////////////////////////////////////
		// Criando Anuncios
		////////////////////////////////////////////////////////////////////////
		
		Anuncio 
		anuncio1 = new Anuncio("Itau", "https://www.youtube.com/watch?v=g9_8WjRxuAg"); 
		anuncio1.addPerfil(pJoven18_29_RJ);
		anuncio1.addPerfil(pAdulto30_39);
		anuncio1.addPerfil(pSenhores40_49);
		
		Anuncio 
		anuncio2 = new Anuncio("Goolge", "https://www.youtube.com/watch?v=AWgHLxm5ACw");
		anuncio2.addPerfil(pTodos);
		
		ArrayList<Anuncio>  ret = new ArrayList<Anuncio>();
		ret.add(anuncio1);
		ret.add(anuncio2);
		////////////////////////////////////////////////////////////////////////
		
		
		return ret;
	}
	
}
