package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.EstimatedGNImale;

public interface EstimatedGNImaleDAO extends JpaRepository<EstimatedGNImale, Integer>{
	//public EstimatedGNImale findByIDandYear(int theID, int theYear);
}
