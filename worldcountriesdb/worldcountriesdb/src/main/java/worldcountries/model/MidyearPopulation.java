package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "MIDYEAR_POPULATION")
public class MidyearPopulation {

	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "P_COUNTRY_ID")
	private int p_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "P_YEAR")
	private int p_year;
	
	@Column(name = "COUNTRY_CODE")
	private String country_code;
	
	@Column(name = "COUNTRY_NAME")
	private String coutry_name;
	
	@Column(name = "MIDYEAR_POPULATION_")
	private int midyear_population;

	
	//CONSTRUCTORS
	public MidyearPopulation() {}
	
	public MidyearPopulation(int p_country_id, int p_year) {
		super();
		this.p_country_id = p_country_id;
		this.p_year = p_year;
	}
	
	
	//SETTERS & GETTERS
	public int getP_country_id() {
		return p_country_id;
	}

	public void setP_country_id(int p_country_id) {
		this.p_country_id = p_country_id;
	}

	public int getP_year() {
		return p_year;
	}

	public void setP_year(int p_year) {
		this.p_year = p_year;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCoutry_name() {
		return coutry_name;
	}

	public void setCoutry_name(String coutry_name) {
		this.coutry_name = coutry_name;
	}

	public int getMidyear_population() {
		return midyear_population;
	}

	public void setMidyear_population(int midyear_population) {
		this.midyear_population = midyear_population;
	}

}
