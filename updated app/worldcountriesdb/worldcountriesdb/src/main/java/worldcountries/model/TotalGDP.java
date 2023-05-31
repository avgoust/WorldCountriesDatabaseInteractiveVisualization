package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "GFCF")
public class TotalGDP {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GDP_COUNTRY_ID")
	private int gdp_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GDP_YEAR")
	private int gdp_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "GDP_TOTAL")
	private float gdp_total;
	
	
	// CONSTRUCTORS
	public TotalGDP() {}
	
	public TotalGDP(int gdp_country_id, int gdp_year) {
		super();
		this.gdp_country_id = gdp_country_id;
		this.gdp_year = gdp_year;
	}
	
	
	// GETTERS & SETTERS
	public int getGdp_country_id() {
		return gdp_country_id;
	}

	public void setGdp_country_id(int gdp_country_id) {
		this.gdp_country_id = gdp_country_id;
	}

	public int getGdp_year() {
		return gdp_year;
	}

	public void setGdp_year(int gdp_year) {
		this.gdp_year = gdp_year;
	}

	public float getGdp_total() {
		return gdp_total;
	}

	public void setGdp_total(float gdp_total) {
		this.gdp_total = gdp_total;
	}
}
