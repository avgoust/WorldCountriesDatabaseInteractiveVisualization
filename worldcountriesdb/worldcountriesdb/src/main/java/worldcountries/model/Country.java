package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "COUNTRY")

public class Country {
	
	// define fields
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "COUNTRY_ID")
	private int country_id;
	
	@Column(name = "ISO")
	private String ISO;
	
	@Column(name = "ISO3")
	private String ISO3;
	
	@Column(name = "FIPS")
	private String fips;
	
	@Column(name = "DISPLAY_NAME")
	private String display_name;
	
	@Column(name = "CAPITAL")
	private String capital;
	
	@Column(name = "CONTINENT")
	private String continent;
	
	@Column(name = "CURRENCY_CODE")
	private String currency_code;
	
	@Column(name = "CURRENCY_NAME")
	private String currency_name;
	
	@Column(name = "PHONE")
	private int phone;
	
	@Column(name = "REGION_CODE")
	private int region_code;
	
	@Column(name = "REGION_NAME")
	private String region_name;
	
	@Column(name = "SUBREGION_CODE")
	private int subregion_code;
	
	@Column(name = "SUBREGION_NAME")
	private String subregion_name;
	
	@Column(name = "INTERMEDIATE_REGION_CODE")
	private int intermediate_region_code;
	
	@Column(name = "INTERMEDIATE_REGION_NAME")
	private String intemediate_region_name;
	
	@Column(name = "C_STATUS")
	private String c_status;
	
	@Column(name = "DEVELOPMENT")
	private String development;
	
	@Column(name = "SIDS")	//SMALL ISLAND DEVELOPING STATES
	private String sids;
	
	@Column(name = "LLDC")	//LAND LOCKED DEVELOPING COUNTRIES
	private String lldc;
	
	@Column(name = "LDC")	//LEAST DEVELOPED COUNTRIES
	private String ldc;
	
	@Column(name = "AREA_SQKM")
	private int area_sqkm;
	
	@Column(name = "POPULATION")
	private int population;
	
	@Column(name = "COUNTRY_AREA")
	private int country_area;
	
	
	// DEFINE CONSTRUCTORS
	public Country() {}
	
	public Country(int country_id) {
		super();
		this.country_id = country_id;
	}



	// GETTERS & SETTERS
	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public String getSubregion_name() {
		return subregion_name;
	}

	public void setSubregion_name(String subregion_name) {
		this.subregion_name = subregion_name;
	}

	public String getIntemediate_region_name() {
		return intemediate_region_name;
	}

	public void setIntemediate_region_name(String intemediate_region_name) {
		this.intemediate_region_name = intemediate_region_name;
	}

	public String getC_status() {
		return c_status;
	}

	public void setC_status(String c_status) {
		this.c_status = c_status;
	}

	public String getDevelopment() {
		return development;
	}

	public void setDevelopment(String development) {
		this.development = development;
	}

	public String getSids() {
		return sids;
	}

	public void setSids(String sids) {
		this.sids = sids;
	}

	public String getLldc() {
		return lldc;
	}

	public void setLldc(String lldc) {
		this.lldc = lldc;
	}

	public String getLdc() {
		return ldc;
	}

	public void setLdc(String ldc) {
		this.ldc = ldc;
	}

	public int getArea_sqkm() {
		return area_sqkm;
	}

	public void setArea_sqkm(int area_sqkm) {
		this.area_sqkm = area_sqkm;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getCountry_area() {
		return country_area;
	}

	public void setCountry_area(int country_area) {
		this.country_area = country_area;
	}
	
}
