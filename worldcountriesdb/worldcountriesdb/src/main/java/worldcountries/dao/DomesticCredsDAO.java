package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.DomesticCreds;

public interface DomesticCredsDAO extends JpaRepository<DomesticCreds, Integer>{
	public DomesticCreds findByIDandYear(int theID, int theYear);
}
