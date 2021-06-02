package br.com.mariobacellar.admanager.common;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.mariobacellar.admanager.model.Anuncio;
import br.com.mariobacellar.admanager.model.Perfil;
import br.com.mariobacellar.admanager.model.PerfilRequested;

public class AdRuler {
	
	private static final Logger logger = LogManager.getLogger(AdRuler.class);
	 
	@Autowired
	public AdRuler() {
	}

	
	
	public ArrayList<Anuncio> getAnuncioByProfile(PerfilRequested perfilRequested, ArrayList<Anuncio> globalAnuncios){
		 
		ArrayList<Anuncio>  ret = new  ArrayList<Anuncio>();

		for (Anuncio anuncio : globalAnuncios) {
			logger.debug("=========================================");
			logger.debug("Anuncio=["+anuncio.getNome()+"]");
			logger.debug("=========================================");

			ArrayList<Perfil> perfis = (ArrayList<Perfil>)anuncio.getPerfis();

			boolean isAnuncioaOk = false;
			
			for (Perfil perfil : perfis) {
				
				isAnuncioaOk = perfil.thus(perfilRequested)	;
				
				logger.debug("=========================================");
				logger.debug("Testing if [" + perfilRequested + "] is compliance with ["+perfil+"]");	
				logger.debug(" - isAnuncioaOk[ "+ isAnuncioaOk +"] " + perfil );
				logger.debug("=========================================");
				if (isAnuncioaOk ) {
					ret.add(anuncio);
					logger.debug("Added Anuncio ["+anuncio+"]");
					break;
				}
			}
		}
		return ret;
	}
	
	
	
}
