package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.GFCF;

public interface GFCF_DAO extends JpaRepository<GFCF, Integer>{
	public GFCF findByIDandYear(int theID, int theYear);
}
