package worldcountries.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "EST_GNI_F")
public class EstimatedGNIfemale {

	// define fields
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GNIF_COUNTRY_ID")
	private int gni_f_country_id;
	
	@Id // PRIMARY KEY
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "GNIF_YEAR")
	private int gni_f_year;
	
	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "ESTIMATED_GNI_FEMALE")
	private int gni_f;
	
	
	// CONSTRUCTORS
		public EstimatedGNIfemale() {}
		
		public EstimatedGNIfemale(int gni_f_country_id, int gni_f_year) {
			super();
			this.gni_f_country_id = gni_f_country_id;
			this.gni_f_year = gni_f_year;
		}
		
		public EstimatedGNIfemale(int gni_f_country_id, int gni_f_year, int gni_f) {
			super();
			this.gni_f_country_id = gni_f_country_id;
			this.gni_f_year = gni_f_year;
			this.gni_f = gni_f;
		}

		
		
		// GETTERS & SETTERS
		public int getGni_f_country_id() {
			return gni_f_country_id;
		}

		public void setGni_f_country_id(int gni_f_country_id) {
			this.gni_f_country_id = gni_f_country_id;
		}

		public int getGni_f_year() {
			return gni_f_year;
		}

		public void setGni_f_year(int gni_f_year) {
			this.gni_f_year = gni_f_year;
		}

		public int getGni_f() {
			return gni_f;
		}

		public void setGni_f(int gni_f) {
			this.gni_f = gni_f;
		}

}
