package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "LSHGPD")
public class LSHGPD {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "L_COUNTRY_ID")
	private int l_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "L_YEAR")
	private int l_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "LABOUR_SHARE_OF_GDP")
	private float labour_share_gdp;
	
	
	// CONSTRUCTORS
	public LSHGPD() {}

	public LSHGPD(int l_country_id, int l_year) {
		super();
		this.l_country_id = l_country_id;
		this.l_year = l_year;
	}

	
	
	// GETTERS & SETTERS
	public int getL_country_id() {
		return l_country_id;
	}

	public void setL_country_id(int l_country_id) {
		this.l_country_id = l_country_id;
	}

	public int getL_year() {
		return l_year;
	}

	public void setL_year(int l_year) {
		this.l_year = l_year;
	}

	public float getLabour_share_gdp() {
		return labour_share_gdp;
	}

	public void setLabour_share_gdp(float labour_share_gdp) {
		this.labour_share_gdp = labour_share_gdp;
	}
	
}
