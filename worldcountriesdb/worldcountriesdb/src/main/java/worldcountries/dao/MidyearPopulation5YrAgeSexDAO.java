package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.MidyearPopulation5YrAgeSex;

public interface MidyearPopulation5YrAgeSexDAO extends JpaRepository<MidyearPopulation5YrAgeSex, Integer>{
	public MidyearPopulation5YrAgeSex findByID_Year_SA_AGI(int theID, int theYear, int theStartingAge, String theAgeGroupInd);
}
