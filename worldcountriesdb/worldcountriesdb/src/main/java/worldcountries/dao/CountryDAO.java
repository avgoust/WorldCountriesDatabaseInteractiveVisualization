package worldcountries.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import worldcountries.model.Country;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer>{

	public List<Country> findByID(int theID);
}
