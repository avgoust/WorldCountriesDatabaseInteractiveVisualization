package worldcountries.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import worldcountries.model.GNIperCapita;

public interface GNIperCapitaDAO extends JpaRepository<GNIperCapita, Integer>{
	public GNIperCapita findByIDandYear(int theID, int theYear);
}
