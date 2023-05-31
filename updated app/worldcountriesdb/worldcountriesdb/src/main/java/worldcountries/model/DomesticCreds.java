package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "DOMESTIC_CREDS")
public class DomesticCreds {

	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "DC_COUNTRY_ID")
	private int dc_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "DC_YEAR")
	private int dc_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "DOMESTIC_CREDITS")
	private float domestic_creds;

	
	
	// CONSTRUCTORS
	public DomesticCreds() {}
	
	public DomesticCreds(int dc_country_id, int dc_year) {
		super();
		this.dc_country_id = dc_country_id;
		this.dc_year = dc_year;
	}
	
	public DomesticCreds(int dc_country_id, int dc_year, float domestic_creds) {
		super();
		this.dc_country_id = dc_country_id;
		this.dc_year = dc_year;
		this.domestic_creds = domestic_creds;
	}

	
	
	// GETTERS & SETTERS
	public int getDc_country_id() {
		return dc_country_id;
	}

	public void setDc_country_id(int dc_country_id) {
		this.dc_country_id = dc_country_id;
	}

	public int getDc_year() {
		return dc_year;
	}

	public void setDc_year(int dc_year) {
		this.dc_year = dc_year;
	}

	public float getDomestic_creds() {
		return domestic_creds;
	}

	public void setDomestic_creds(float domestic_creds) {
		this.domestic_creds = domestic_creds;
	}
	
}
