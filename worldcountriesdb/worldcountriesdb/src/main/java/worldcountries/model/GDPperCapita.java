package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "GDPperCapita")
public class GDPperCapita {

	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GDPC_COUNTRY_ID")
	private int gdpc_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GDPC_YEAR")
	private int gdpc_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "GDP_PER_CAPITA_")
	private int gdpc;

	
	
	// CONSTRUCTORS
	public GDPperCapita() {}
	
	public GDPperCapita(int gdpc_country_id, int gdpc_year) {
		super();
		this.gdpc_country_id = gdpc_country_id;
		this.gdpc_year = gdpc_year;
	}

	public GDPperCapita(int gdpc_country_id, int gdpc_year, int gdpc) {
		super();
		this.gdpc_country_id = gdpc_country_id;
		this.gdpc_year = gdpc_year;
		this.gdpc = gdpc;
	}

	// GETTERS & SETTERS
	public int getGdpc_country_id() {
		return gdpc_country_id;
	}

	public void setGdpc_country_id(int gdpc_country_id) {
		this.gdpc_country_id = gdpc_country_id;
	}

	public int getGdpc_year() {
		return gdpc_year;
	}

	public void setGdpc_year(int gdpc_year) {
		this.gdpc_year = gdpc_year;
	}

	public int getGdpc() {
		return gdpc;
	}

	public void setGdpc(int gdpc) {
		this.gdpc = gdpc;
	}
	
}
