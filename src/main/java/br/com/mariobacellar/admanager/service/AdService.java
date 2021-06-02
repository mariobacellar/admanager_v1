package br.com.mariobacellar.admanager.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mariobacellar.admanager.common.Util;
import br.com.mariobacellar.admanager.model.AdSegmentation;
import br.com.mariobacellar.admanager.model.Anuncio;
import br.com.mariobacellar.admanager.model.PerfilRequested;
import br.com.mariobacellar.admanager.repo.AdRepository;

@Service
public class AdService {

	@Autowired
	private AdRepository repo;

	public String getJSON_Ads(String id) {
		try {
			String		filename= "src/main/resources/Ads"+id+".json";
			System.out.println("filename=("+filename+")");
			File		file	= new File(filename);
			String[]	json	= Util.doReadLines(file);
			String 		jsonStr = Util.convert2String(json); 
			return 	jsonStr;
		} catch (Exception e) {
			return "{null}";
		}
	}

	public ArrayList<Anuncio> getAnuncioByProfile(PerfilRequested perfilRequested) {
		return repo.selectByProfile(perfilRequested);
	}
	
	public String saveAnuncios(String id, List<AdSegmentation> ltAdSegmentation) {
		return repo.saveAnuncios(id, ltAdSegmentation);
	}
	
	
}