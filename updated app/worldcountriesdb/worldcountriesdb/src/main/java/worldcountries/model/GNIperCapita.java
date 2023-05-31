package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "GNIperCapita")
public class GNIperCapita {

	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GNI_COUNTRY_ID")
	private int gni_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GNI_YEAR")
	private int gni_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "GNI_PER_CAPITA_")
	private int gni;

	
	
	// CONSTRUCTORS
	public GNIperCapita() {}
	
	public GNIperCapita(int gni_country_id, int gni_year) {
		super();
		this.gni_country_id = gni_country_id;
		this.gni_year = gni_year;
	}
	
	public GNIperCapita(int gni_country_id, int gni_year, int gni) {
		super();
		this.gni_country_id = gni_country_id;
		this.gni_year = gni_year;
		this.gni = gni;
	}

	
	// GETTERS & SETTERS
	public int getGni_country_id() {
		return gni_country_id;
	}

	public void setGni_country_id(int gni_country_id) {
		this.gni_country_id = gni_country_id;
	}

	public int getGni_year() {
		return gni_year;
	}

	public void setGni_year(int gni_year) {
		this.gni_year = gni_year;
	}

	public int getGni() {
		return gni;
	}

	public void setGni(int gni) {
		this.gni = gni;
	}
	
}
