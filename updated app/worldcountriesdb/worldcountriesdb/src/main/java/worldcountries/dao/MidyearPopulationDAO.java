package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.MidyearPopulation;

public interface MidyearPopulationDAO extends JpaRepository<MidyearPopulation, Integer>{
	//public MidyearPopulation findByIDandYear(int theID, int theYear);
}
