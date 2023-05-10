package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "MIDYEAR_POP_5YR")
public class MidyearPopulation5YrAgeSex {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "P5YR_COUNTRY_ID")
	private int p5yr_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "P5YR_YEAR")
	private int p5yr_year;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "STARTING_AGE")
	private int starting_age;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "AGE_GROUP_INDICATOR")
	private String age_group_indicator;
	
	@Column(name = "COUNTRY_CODE")
	private String country_code;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "TOTAL_FLAG")
	private String total_flag;
	
	@Column(name = "ENDING_AGE")
	private int ending_age;
	
	@Column(name = "MIDYEAR_POP")
	private int midyear_pop;
	
	@Column(name = "MIDYEAR_POP_M")
	private int midyear_pop_m;
	
	@Column(name = "MIDYEAR_POP_F")
	private int midyear_pop_f;
	
	
	// CONSTRUCTORS
	public MidyearPopulation5YrAgeSex() {}


	public MidyearPopulation5YrAgeSex(int p5yr_country_id, int p5yr_year, int starting_age,
			String age_group_indicator) {
		super();
		this.p5yr_country_id = p5yr_country_id;
		this.p5yr_year = p5yr_year;
		this.starting_age = starting_age;
		this.age_group_indicator = age_group_indicator;
	}


	
	
	// SETTERS & GETTERS
	public int getP5yr_country_id() {
		return p5yr_country_id;
	}


	public void setP5yr_country_id(int p5yr_country_id) {
		this.p5yr_country_id = p5yr_country_id;
	}


	public int getP5yr_year() {
		return p5yr_year;
	}


	public void setP5yr_year(int p5yr_year) {
		this.p5yr_year = p5yr_year;
	}


	public int getStarting_age() {
		return starting_age;
	}


	public void setStarting_age(int starting_age) {
		this.starting_age = starting_age;
	}


	public String getAge_group_indicator() {
		return age_group_indicator;
	}


	public void setAge_group_indicator(String age_group_indicator) {
		this.age_group_indicator = age_group_indicator;
	}


	public String getCountry_name() {
		return country_name;
	}


	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}


	public String getTotal_flag() {
		return total_flag;
	}


	public void setTotal_flag(String total_flag) {
		this.total_flag = total_flag;
	}


	public int getEnding_age() {
		return ending_age;
	}


	public void setEnding_age(int ending_age) {
		this.ending_age = ending_age;
	}


	public int getMidyear_pop() {
		return midyear_pop;
	}


	public void setMidyear_pop(int midyear_pop) {
		this.midyear_pop = midyear_pop;
	}


	public int getMidyear_pop_m() {
		return midyear_pop_m;
	}


	public void setMidyear_pop_m(int midyear_pop_m) {
		this.midyear_pop_m = midyear_pop_m;
	}


	public int getMidyear_pop_f() {
		return midyear_pop_f;
	}


	public void setMidyear_pop_f(int midyear_pop_f) {
		this.midyear_pop_f = midyear_pop_f;
	}

}
