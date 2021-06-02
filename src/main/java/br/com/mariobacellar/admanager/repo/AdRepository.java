package br.com.mariobacellar.admanager.repo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.mariobacellar.admanager.common.AdRuler;
import br.com.mariobacellar.admanager.common.Util;
import br.com.mariobacellar.admanager.model.AdSegmentation;
import br.com.mariobacellar.admanager.model.Anuncio;
import br.com.mariobacellar.admanager.model.PerfilRequested;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 



@Repository
public class AdRepository {

	private static ArrayList<Anuncio>  allAnuncios;
	
	private static AdRuler ruler;
	
	@Autowired
	public AdRepository(){
		if (allAnuncios	==null) allAnuncios = Util.buildAnunciosFake();
		if (ruler		==null) ruler		= new AdRuler();
	}
	
	public ArrayList<Anuncio> selectByProfile(PerfilRequested perfilRequested){
		ArrayList<Anuncio> ret = ruler.getAnuncioByProfile(perfilRequested, allAnuncios );
		return ret;
	}
	
	public ArrayList<Anuncio> selectAllAnuncios(){
		return 	allAnuncios;
	}


	public String saveAnuncios(String id, List<AdSegmentation> ltAdSegmentation) {
		StringBuffer content = new StringBuffer("{\"AdSegmentations\":[");
		try {
			
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

			String json = "";
			AdSegmentation adSegmentation = null;
			
			for (int i=0; i<ltAdSegmentation.size();i++){
				adSegmentation = ltAdSegmentation.get(i);
				json = ow.writeValueAsString(adSegmentation);
				content.append(json);
				if (i!=ltAdSegmentation.size()-1) content.append(",");
			}
			content.append("]}");
			
			File newfile = new File("./src/main/resources/Ads"+id+".json");
			
			//	Files.write(Paths.get("/src/main/resources/Ads"+id+".json"), content.toString().getBytes());

			Files.write(Paths.get(newfile.getAbsolutePath()), content.toString().getBytes());
			
			return "{\"id\":"+id+"}";
		} catch (IOException e) {
			e.printStackTrace();
			return "{}";
		}
	}



}
