package br.com.mariobacellar.admanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mariobacellar.admanager.model.AdSegmentation;
import br.com.mariobacellar.admanager.service.AdService;

@RestController
@RequestMapping("/api/admanager")
public class AdController {

	@Autowired 
	private   AdService service;


	@RequestMapping("")
	@ResponseBody
	public String home() {
		return "{" + "\"autor\":\"https://www.linkedin.com/in/mariobacellar/\","
				+ "\"gtihub\":\"https://github.com/mariobacellar/admanager\"," + "\"resources\":[" + "{"
				+ "\"Advertisement\":\" Advertisement management\","
				+ "\"URL\":\"https://macro-admanager.herokuapp.com/api/admanager/ads \"" + "}," + "{"
				+ "\"Advertisement\":\" Advertisement management\","
				+ "\"URL\":\"https://macro-admanager.herokuapp.com/api/admanager/ads/1 \"" + "}" + "]" + "}";
	}

	@RequestMapping("/ads")
	@ResponseBody
	public String getAds() {
		return service.getJSON_Ads("");
	}

	@RequestMapping("/ads/{id}")
	@ResponseBody
	public String getAds(@PathVariable String id) {
		System.out.println("id=(" + id + ")");
		return service.getJSON_Ads(id);
	}
	
	@RequestMapping(value="/saveAnuncios/{id}", consumes = "application/JSON", method = RequestMethod.POST)
	public String saveAnuncios(@RequestBody List<AdSegmentation> ltAdSegmentation,@PathVariable String id){
		System.out.println("saveAnuncios...");
		
		for (AdSegmentation adSegmentation : ltAdSegmentation)
			System.out.println(adSegmentation);
		
		return service.saveAnuncios(id, ltAdSegmentation);
	}
	
}