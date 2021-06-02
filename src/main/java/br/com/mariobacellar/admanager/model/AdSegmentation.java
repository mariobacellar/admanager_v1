package br.com.mariobacellar.admanager.model;

import java.io.Serializable;

public class AdSegmentation implements Serializable{

	private static final long serialVersionUID = 1L;

    public String adId;
    public String adScore;
    public String adViews;
    public String adBgURL;
    public String adTitle;
    public String adType;
    public String adDesc;
    public String thankBG;
    public String thankTitle;
    public String thankDesc;
    public String thankCTAType;
    public String cTAName;
    
    
    
	public AdSegmentation() {
	}

	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdScore() {
		return adScore;
	}
	public void setAdScore(String adScore) {
		this.adScore = adScore;
	}
	public String getAdViews() {
		return adViews;
	}
	public void setAdViews(String adViews) {
		this.adViews = adViews;
	}
	public String getAdBgURL() {
		return adBgURL;
	}
	public void setAdBgURL(String adBgURL) {
		this.adBgURL = adBgURL;
	}
	public String getAdTitle() {
		return adTitle;
	}
	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}
	public String getAdType() {
		return adType;
	}
	public void setAdType(String adType) {
		this.adType = adType;
	}
	public String getAdDesc() {
		return adDesc;
	}
	public void setAdDesc(String adDesc) {
		this.adDesc = adDesc;
	}
	public String getThankBG() {
		return thankBG;
	}
	public void setThankBG(String thankBG) {
		this.thankBG = thankBG;
	}
	public String getThankTitle() {
		return thankTitle;
	}
	public void setThankTitle(String thankTitle) {
		this.thankTitle = thankTitle;
	}
	public String getThankDesc() {
		return thankDesc;
	}
	public void setThankDesc(String thankDesc) {
		this.thankDesc = thankDesc;
	}
	public String getThankCTAType() {
		return thankCTAType;
	}
	public void setThankCTAType(String thankCTAType) {
		this.thankCTAType = thankCTAType;
	}
	public String getcTAName() {
		return cTAName;
	}
	public void setcTAName(String cTAName) {
		this.cTAName = cTAName;
	}
    
	@Override
	public String toString() {
		return  
		"adId=["+adId+"] adScore=["+adScore+"] adViews=["+adViews+"] adBgURL=["+adBgURL+"] adTitle=["+adTitle+"] adType=["+adType+"] adDesc=["+adDesc+"] thankBG=["+thankBG+"] thankTitle=["+thankTitle+"] thankDesc=["+thankDesc+"] thankCTAType=["+thankCTAType+"]cTAName=["+cTAName+"]";
	}
    

}
