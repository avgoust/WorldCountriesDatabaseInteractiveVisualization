package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import worldcountries.model.Country;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer>{

	public Country findByID(int theID);
}
