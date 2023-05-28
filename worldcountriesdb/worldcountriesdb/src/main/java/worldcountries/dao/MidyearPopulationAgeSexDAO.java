package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.MidyearPopulationAgeSex;

public interface MidyearPopulationAgeSexDAO extends JpaRepository<MidyearPopulationAgeSex, Integer>{
	public MidyearPopulationAgeSex findByID_Year_Sex(int theId, int theYear, String theSex);
}
