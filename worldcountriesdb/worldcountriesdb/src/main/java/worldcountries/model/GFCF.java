package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "GFCF")
public class GFCF {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GFCF_COUNTRY_ID")
	private int gfcf_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GFCF_YEAR")
	private int gfcf_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "GROSS_FIXED_CAPITAL_FORMATION")
	private float gfcf;

	
	// CONSTRUCTORS
	public GFCF() {}

	public GFCF(int gfcf_country_id, int gfcf_year) {
		super();
		this.gfcf_country_id = gfcf_country_id;
		this.gfcf_year = gfcf_year;
	}

	
	
	// GETTERS & SETTERS
	public int getGfcf_country_id() {
		return gfcf_country_id;
	}

	public void setGfcf_country_id(int gfcf_country_id) {
		this.gfcf_country_id = gfcf_country_id;
	}

	public int getGfcf_year() {
		return gfcf_year;
	}

	public void setGfcf_year(int gfcf_year) {
		this.gfcf_year = gfcf_year;
	}

	public float getGfcf() {
		return gfcf;
	}

	public void setGfcf(float gfcf) {
		this.gfcf = gfcf;
	}
}
