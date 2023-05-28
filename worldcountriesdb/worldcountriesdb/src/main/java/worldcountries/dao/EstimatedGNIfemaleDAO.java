package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.EstimatedGNIfemale;

public interface EstimatedGNIfemaleDAO extends JpaRepository<EstimatedGNIfemale, Integer>{
	public EstimatedGNIfemale findByIDandYear(int theID, int theYear);
}
