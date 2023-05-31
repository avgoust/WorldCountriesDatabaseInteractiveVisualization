package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "EST_GNI_M")
public class EstimatedGNImale {

	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GNIM_COUNTRY_ID")
	private int gni_m_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GNIM_YEAR")
	private int gni_m_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "ESTIMATED_GNI_MALE")
	private int gni_m;

	
	
	// CONSTRUCTORS
	public EstimatedGNImale() {}
	
	public EstimatedGNImale(int gni_m_country_id, int gni_m_year) {
		super();
		this.gni_m_country_id = gni_m_country_id;
		this.gni_m_year = gni_m_year;
	}
	
	public EstimatedGNImale(int gni_m_country_id, int gni_m_year, int gni_m) {
		super();
		this.gni_m_country_id = gni_m_country_id;
		this.gni_m_year = gni_m_year;
		this.gni_m = gni_m;
	}

	
	
	// GETTERS & SETTERS
	public int getGni_m_country_id() {
		return gni_m_country_id;
	}

	public void setGni_m_country_id(int gni_m_country_id) {
		this.gni_m_country_id = gni_m_country_id;
	}

	public int getGni_m_year() {
		return gni_m_year;
	}

	public void setGni_m_year(int gni_m_year) {
		this.gni_m_year = gni_m_year;
	}

	public int getGni_m() {
		return gni_m;
	}

	public void setGni_m(int gni_m) {
		this.gni_m = gni_m;
	}
}
