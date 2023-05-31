package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.GDPperCapita;

public interface GDPperCapitaDAO extends JpaRepository<GDPperCapita, Integer>{
	//public GDPperCapita findByIDandYear(int theID, int theYear);
}
