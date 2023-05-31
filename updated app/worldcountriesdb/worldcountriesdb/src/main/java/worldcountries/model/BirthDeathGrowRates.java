package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "BIRTH_DEATH_GROWTH_RATES")

public class BirthDeathGrowRates {
	// define fields
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "BD_COUNTRY_ID")
	private int bd_country_id;

	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "BD_YEAR")
	private int bd_year;
	
	@Column(name = "BD_COUNTRY_CODE")
	private String bd_country_code;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "CRUDE_BIRTH_RATE")
	private float crude_br;
	
	@Column(name = "CRUDE_DEATH_RATE")
	private float crude_dr;
	
	@Column(name = "NET_MIGRATION")
	private float net_migration;
	
	@Column(name = "NET_NATURAL_INCREASE")
	private float net_nat_inc;
	
	@Column(name = "GROWTH_RATE")
	private int growth_rate;
	
	
	//CONSTRUCTORS
	public BirthDeathGrowRates() {}
	
	public BirthDeathGrowRates(int bd_country_id, int bd_year) {
		super();
		this.bd_country_id = bd_country_id;
		this.bd_year = bd_year;
	}

	
	//SETTERS & GETTERS
	public int getBd_country_id() {
		return bd_country_id;
	}

	public void setBd_country_id(int bd_country_id) {
		this.bd_country_id = bd_country_id;
	}

	public int getBd_year() {
		return bd_year;
	}

	public void setBd_year(int bd_year) {
		this.bd_year = bd_year;
	}

	public String getBd_country_code() {
		return bd_country_code;
	}

	public void setBd_country_code(String bd_country_code) {
		this.bd_country_code = bd_country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public float getCrude_br() {
		return crude_br;
	}

	public void setCrude_br(float crude_br) {
		this.crude_br = crude_br;
	}

	public float getCrude_dr() {
		return crude_dr;
	}

	public void setCrude_dr(float crude_dr) {
		this.crude_dr = crude_dr;
	}

	public float getNet_migration() {
		return net_migration;
	}

	public void setNet_migration(float net_migration) {
		this.net_migration = net_migration;
	}

	public float getNet_nat_inc() {
		return net_nat_inc;
	}

	public void setNet_nat_inc(float net_nat_inc) {
		this.net_nat_inc = net_nat_inc;
	}

	public int getGrowth_rate() {
		return growth_rate;
	}

	public void setGrowth_rate(int growth_rate) {
		this.growth_rate = growth_rate;
	}
	
}
