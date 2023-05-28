package worldcountries.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import worldcountries.model.AgeSpecificFertilityRates;
import worldcountries.service.AgeSpecificFertilityRatesService;

@Controller
@RequestMapping(path = "/AGE_SPECIFIC_FERTILITY_RATES")
public class AgeSpecificFertilityRatesController {
	
	@Autowired
	private AgeSpecificFertilityRatesService ageService;
	
	@Autowired
	public AgeSpecificFertilityRatesController(AgeSpecificFertilityRatesService ageService) {
		this.ageService = ageService;
	}
	

}
