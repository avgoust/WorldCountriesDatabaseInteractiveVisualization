package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.AgeSpecificFertilityRates;

public interface AgeSpecificFertitlityRatesDAO extends JpaRepository<AgeSpecificFertilityRates, Integer>{
	//public AgeSpecificFertilityRates findByIDandYear(int theID, int theYear);
	
}
