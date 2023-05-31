package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "INCOME_INDEX")
public class IncomeIndex {
	
	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "I_COUNTRY_ID")
	private int i_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "I_YEAR")
	private int i_year;
	
	@Column(name = "INCOME_INDEX")
	private float income_index;
	
	@Column(name = "COUNTRY_NAME")
	private int country_name;
	
	
	
	// CONSTRUCTORS
	public  IncomeIndex() {}

	public IncomeIndex(int i_country_id, int i_year) {
		super();
		this.i_country_id = i_country_id;
		this.i_year = i_year;
	}

	
	
	// GETTERS & SETTERS
	public int getI_country_id() {
		return i_country_id;
	}

	public void setI_country_id(int i_country_id) {
		this.i_country_id = i_country_id;
	}

	public int getI_year() {
		return i_year;
	}

	public void setI_year(int i_year) {
		this.i_year = i_year;
	}

	public float getIncome_index() {
		return income_index;
	}

	public void setIncome_index(float income_index) {
		this.income_index = income_index;
	}

	public int getCountry_name() {
		return country_name;
	}

	public void setCountry_name(int country_name) {
		this.country_name = country_name;
	}

}
