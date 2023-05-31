package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.BirthDeathGrowRates;

public interface BirthDeathGrowRatesDAO extends JpaRepository<BirthDeathGrowRates, Integer>{
	//public BirthDeathGrowRates findbyIDandYear(int theID, int theYear);
}
