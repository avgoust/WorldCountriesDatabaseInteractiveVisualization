package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.TotalGDP;

public interface TotalGDP_DAO extends JpaRepository<TotalGDP, Integer>{
	public TotalGDP findByIDandYear(int theID, int theYear);
}
