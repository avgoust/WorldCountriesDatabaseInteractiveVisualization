package worldcountries.service;

import java.util.Map;

import worldcountries.model.AgeSpecificFertilityRates;

public interface AgeSpecificFertilityRatesService {
	
	public AgeSpecificFertilityRates findByIDandYear(int theID, int theYear);
	
	// statistics
	public Map<String, Double> getAgeSpecificFRtsStatistics(int id, int year);
}
