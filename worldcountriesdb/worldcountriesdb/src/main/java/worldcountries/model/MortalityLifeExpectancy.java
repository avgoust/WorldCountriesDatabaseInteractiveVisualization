package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "MORTALITY_LIFE_EXPECTANCY")
public class MortalityLifeExpectancy {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "M_COUNTRY_ID")
	private int m_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "M_YEAR")
	private int m_year;
	
	@Column(name = "COUNTRY_CODE")
	private String country_code;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "INFANT_MORTALITY")
	private float infant_mortality;
	
	@Column(name = "INFANT_MORTALITY_MALE")
	private float infant_mortality_m;
	
	@Column(name = "INFANT_MORTALITY_FEMALE")
	private float infant_mortality_f;
	
	@Column(name = "LIFE_EXPECTANCY")
	private float life_expectancy;
	
	@Column(name = "LIFE_EXPECTANCY_MALE")
	private float life_expectancy_m;
	
	@Column(name = "LIFE_EXPECTANCY_FEMALE")
	private float life_expectancy_f;
	
	@Column(name = "MORTALITY_RATE_UNDER_5")
	private float mortality_rt_under_5;
	
	@Column(name = "MORTALITY_RATE_UNDER_5_MALE")
	private float mortality_rt_under_5_m;
	
	@Column(name = "MORTALITY_RATE_UNDER_5_FEMALE")
	private float mortality_rt_under_5_f;
	
	@Column(name = "MORTALITY_RATE_1TO4")
	private float mortality_rt_1to4;
	
	@Column(name = "MORTALITY_RATE_1TO4_MALE")
	private float mortality_rt_1to4_m;
	
	@Column(name = "MORTALITY_RATE_1TO4_FEMALE")
	private float mortality_rt_1to4_f;
	
	
	
	// CONSTRUCTORS
	public MortalityLifeExpectancy() {}

	public MortalityLifeExpectancy(int m_country_id, int m_year) {
		super();
		this.m_country_id = m_country_id;
		this.m_year = m_year;
	}

	
	// GETTERS & SETTERS
	public int getM_country_id() {
		return m_country_id;
	}

	public void setM_country_id(int m_country_id) {
		this.m_country_id = m_country_id;
	}

	public int getM_year() {
		return m_year;
	}

	public void setM_year(int m_year) {
		this.m_year = m_year;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public float getInfant_mortality() {
		return infant_mortality;
	}

	public void setInfant_mortality(float infant_mortality) {
		this.infant_mortality = infant_mortality;
	}

	public float getInfant_mortality_m() {
		return infant_mortality_m;
	}

	public void setInfant_mortality_m(float infant_mortality_m) {
		this.infant_mortality_m = infant_mortality_m;
	}

	public float getInfant_mortality_f() {
		return infant_mortality_f;
	}

	public void setInfant_mortality_f(float infant_mortality_f) {
		this.infant_mortality_f = infant_mortality_f;
	}

	public float getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public float getLife_expectancy_m() {
		return life_expectancy_m;
	}

	public void setLife_expectancy_m(float life_expectancy_m) {
		this.life_expectancy_m = life_expectancy_m;
	}

	public float getLife_expectancy_f() {
		return life_expectancy_f;
	}

	public void setLife_expectancy_f(float life_expectancy_f) {
		this.life_expectancy_f = life_expectancy_f;
	}

	public float getMortality_rt_under_5() {
		return mortality_rt_under_5;
	}

	public void setMortality_rt_under_5(float mortality_rt_under_5) {
		this.mortality_rt_under_5 = mortality_rt_under_5;
	}

	public float getMortality_rt_under_5_m() {
		return mortality_rt_under_5_m;
	}

	public void setMortality_rt_under_5_m(float mortality_rt_under_5_m) {
		this.mortality_rt_under_5_m = mortality_rt_under_5_m;
	}

	public float getMortality_rt_under_5_f() {
		return mortality_rt_under_5_f;
	}

	public void setMortality_rt_under_5_f(float mortality_rt_under_5_f) {
		this.mortality_rt_under_5_f = mortality_rt_under_5_f;
	}

	public float getMortality_rt_1to4() {
		return mortality_rt_1to4;
	}

	public void setMortality_rt_1to4(float mortality_rt_1to4) {
		this.mortality_rt_1to4 = mortality_rt_1to4;
	}

	public float getMortality_rt_1to4_m() {
		return mortality_rt_1to4_m;
	}

	public void setMortality_rt_1to4_m(float mortality_rt_1to4_m) {
		this.mortality_rt_1to4_m = mortality_rt_1to4_m;
	}

	public float getMortality_rt_1to4_f() {
		return mortality_rt_1to4_f;
	}

	public void setMortality_rt_1to4_f(float mortality_rt_1to4_f) {
		this.mortality_rt_1to4_f = mortality_rt_1to4_f;
	}
	
	
}
