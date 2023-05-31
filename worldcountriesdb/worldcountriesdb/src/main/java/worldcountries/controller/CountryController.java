package worldcountries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import worldcountries.dao.CountryDAO;

@Controller
public class CountryController{
	
	@Autowired
	public CountryDAO countryRep;
	
	@RequestMapping(value = "/list-countries")
	public ModelAndView getAllCountries() {
		ModelAndView mav = new ModelAndView("list-countries");
		mav.addObject("countries", countryRep.findAll());
		return mav;
	}
}
