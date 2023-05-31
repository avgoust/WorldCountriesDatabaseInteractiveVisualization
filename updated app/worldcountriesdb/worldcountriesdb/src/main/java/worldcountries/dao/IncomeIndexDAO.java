package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.IncomeIndex;

public interface IncomeIndexDAO extends JpaRepository<IncomeIndex, Integer>{
	//public IncomeIndex findByIDandYear(int theID, int theYear);
}
