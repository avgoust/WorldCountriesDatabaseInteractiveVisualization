package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.MortalityLifeExpectancy;

public interface MortalityLifeExpectancyDAO extends JpaRepository<MortalityLifeExpectancy, Integer>{
	public MortalityLifeExpectancy findByIDandYear(int theId, int theYear);
}
