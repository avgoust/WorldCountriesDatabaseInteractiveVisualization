package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.Country;

public interface CountryDAO extends JpaRepository<Country, Integer>{
	public Country findByID(int theID);
}
