package com.project.actions;

import java.util.HashMap;

import com.general.utilities.BusinessLogic;
import com.opensymphony.xwork2.ActionSupport;
import com.project.logic.CountrySearchService;
import com.webservices.objects.CountryInfo;

public class CountrySearchPage extends ActionSupport {

	private String country, language,currency,capital,icao,meteorologicInfo;
	private int population;
	private double latitude, longitude;
	
	public String execute() throws Exception{
		if(country != null && !"".equals(country)){
			CountrySearchService logic = new CountrySearchService();
			HashMap<String,Object> countryInfo = logic.searchCountry(country);
			
			setLanguage(String.valueOf(countryInfo.get("language")));
			setPopulation(Integer.parseInt(String.valueOf(countryInfo.get("population"))));
			setCurrency(String.valueOf(countryInfo.get("currency")));
			setCapital(String.valueOf(countryInfo.get("capital")));
			setIcao(String.valueOf(countryInfo.get("icao")));
			setLatitude(Double.parseDouble(String.valueOf(countryInfo.get("latitude"))));
			setLongitude(Double.parseDouble(String.valueOf(countryInfo.get("longitude"))));
			setMeteorologicInfo(String.valueOf(countryInfo.get("meteorologic")));
			
			getLanguageText(getText("language.text"));
			getPopulationText(getText("population.text"));
			getCurrencyText(getText("currency.text"));
			getCapitalText(getText("capital.text"));
			getIcaoText(getText("icao.text"));	
			getLatitudeText(getText("latitude.text"));
			getLongitudeText(getText("longitude.text"));
			getMeteorologicText(getText("meteorologic.text"));
		}
		return SUCCESS;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getMeteorologicInfo() {
		return meteorologicInfo;
	}

	public void setMeteorologicInfo(String meteorologicInfo) {
		this.meteorologicInfo = meteorologicInfo;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getLanguageText(String text){
		return text;
	}
	
	public String getPopulationText(String text){
		return text;
	}
	
	public String getCurrencyText(String text){
		return text;
	}
	
	public String getCapitalText(String text){
		return text;
	}

	public String getIcaoText(String text){
		return text;
	}

	public String getLatitudeText(String text){
		return text;
	}
	
	public String getLongitudeText(String text){
		return text;
	}

	public String getMeteorologicText(String text){
		return text;
	}	
}
