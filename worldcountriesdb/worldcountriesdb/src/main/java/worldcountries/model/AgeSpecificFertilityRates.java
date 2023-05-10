package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "AGE_SPECIFIC_FERTILITY_RATES")
public class AgeSpecificFertilityRates {
	
	// define fields
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "FR_COUNTRY_ID")
	private int fr_country_id;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "FR_YEAR")
	private int fr_year;
	
	@Column(name = "FR_COUNTRY_CODE")
	private String fr_country_code;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "FERTILITY_RATE_15_19")
	private float fr_15_19;
	
	@Column(name = "FERTILITY_RATE_20_24")
	private float fr_20_24;
	
	@Column(name = "FERTILITY_RATE_25_29")
	private float fr_25_29;
	
	@Column(name = "FERTILITY_RATE_30_34")
	private float fr_30_34;
	
	@Column(name = "FERTILITY_RATE_35_39")
	private float fr_35_39;
	
	@Column(name = "FERTILITY_RATE_40_44")
	private float fr_40_44;
	
	@Column(name = "FERTILITY_RATE_45_49")
	private float fr_45_49;
	
	@Column(name = "TOTAL_FERTILITY_RATE")
	private float total_fr;
	
	@Column(name = "GROSS_REPRODUCTION_RATE")
	private float grr;
	
	@Column(name = "SEX_RATIO_AT_BIRTH")
	private float srb;
	
	
	//CONSTRUCTORS
	public AgeSpecificFertilityRates() {}
	
	public AgeSpecificFertilityRates(int fr_country_id, int fr_year) {
		super();
		this.fr_country_id = fr_country_id;
		this.fr_year = fr_year;
	}



	//SETTERS & GETTERS
	public int getFr_country_id() {
		return fr_country_id;
	}

	public void setFr_country_id(int fr_country_id) {
		this.fr_country_id = fr_country_id;
	}

	public int getFr_year() {
		return fr_year;
	}

	public void setFr_year(int fr_year) {
		this.fr_year = fr_year;
	}

	public String getFr_country_code() {
		return fr_country_code;
	}

	public void setFr_country_code(String fr_country_code) {
		this.fr_country_code = fr_country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public float getFr_15_19() {
		return fr_15_19;
	}

	public void setFr_15_19(float fr_15_19) {
		this.fr_15_19 = fr_15_19;
	}

	public float getFr_20_24() {
		return fr_20_24;
	}

	public void setFr_20_24(float fr_20_24) {
		this.fr_20_24 = fr_20_24;
	}

	public float getFr_25_29() {
		return fr_25_29;
	}

	public void setFr_25_29(float fr_25_29) {
		this.fr_25_29 = fr_25_29;
	}

	public float getFr_30_34() {
		return fr_30_34;
	}

	public void setFr_30_34(float fr_30_34) {
		this.fr_30_34 = fr_30_34;
	}

	public float getFr_35_39() {
		return fr_35_39;
	}

	public void setFr_35_39(float fr_35_39) {
		this.fr_35_39 = fr_35_39;
	}

	public float getFr_40_44() {
		return fr_40_44;
	}

	public void setFr_40_44(float fr_40_44) {
		this.fr_40_44 = fr_40_44;
	}

	public float getFr_45_49() {
		return fr_45_49;
	}

	public void setFr_45_49(float fr_45_49) {
		this.fr_45_49 = fr_45_49;
	}

	public float getTotal_fr() {
		return total_fr;
	}

	public void setTotal_fr(float total_fr) {
		this.total_fr = total_fr;
	}

	public float getGrr() {
		return grr;
	}

	public void setGrr(float grr) {
		this.grr = grr;
	}

	public float getSrb() {
		return srb;
	}

	public void setSrb(float srb) {
		this.srb = srb;
	}
	
}
