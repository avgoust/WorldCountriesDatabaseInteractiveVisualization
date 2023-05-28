package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.LSHGPD;

public interface LSHGPD_DAO extends JpaRepository<LSHGPD, Integer>{
	public LSHGPD findByIDandYear(int theID, int theYear);
}
