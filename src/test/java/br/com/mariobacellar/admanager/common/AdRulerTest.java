package br.com.mariobacellar.admanager.common;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.mariobacellar.admanager.model.Anuncio;
import br.com.mariobacellar.admanager.model.PerfilRequested;

public class AdRulerTest {

	private static final Logger logger = LogManager.getLogger(AdRulerTest.class);

	
	public static void main(String[] args) {
		try {
			
			PerfilRequested 
			perfil1 = new PerfilRequested("Perfil-Requested-1");
			perfil1.setAge(18);
			perfil1.setRenda(2000);
			perfil1.setUf("RJ");
			
			PerfilRequested 
			perfil2 = new PerfilRequested("Perfil-Requested-2");
			perfil2.setAge(48);
			perfil2.setRenda(22000.00);
			perfil2.setUf("SP");

			PerfilRequested 
			perfil3 = new PerfilRequested("Perfil-Requested-3");
			perfil3.setAge(20);
			perfil3.setRenda(2600);
			perfil3.setUf("SP");

			AdRuler ruler = new AdRuler();
			
			ArrayList<Anuncio>  globalAnuncios  = Util.buildAnunciosFake();


			ArrayList<Anuncio> anunciosDisponiveis1 = ruler.getAnuncioByProfile(perfil1, globalAnuncios );
			logger.info("=======================================");
			logger.info("Solicitando anuncios para perfil11");
			logger.info("=======================================");
			for (Anuncio anuncio : anunciosDisponiveis1)
			logger.info(anuncio.toString());
			logger.info("=======================================");

			ArrayList<Anuncio> anunciosDisponiveis2 = ruler.getAnuncioByProfile(perfil2, globalAnuncios);
			logger.info("=======================================");
			logger.info("Solicitando anuncios para perfil12");
			logger.info("=======================================");
			for (Anuncio anuncio : anunciosDisponiveis2)
			logger.info(anuncio.toString());
			logger.info("=======================================");
			
			ArrayList<Anuncio> anunciosDisponiveis3 = ruler.getAnuncioByProfile(perfil3, globalAnuncios);
			logger.info("=======================================");
			logger.info("Solicitando anuncios para perfil13");
			logger.info("=======================================");
			for (Anuncio anuncio : anunciosDisponiveis3)
			logger.info(anuncio.toString());
			logger.info("=======================================");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
