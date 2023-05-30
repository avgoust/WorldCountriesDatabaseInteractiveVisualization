package worldcountries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import worldcountries.model.Country;
import worldcountries.dao.CountryDAO;

@Controller
@RequestMapping(path = "/countries")
public class CountryController {
	
	@Autowired
	private CountryDAO countryDAO;
	
	@Autowired
	public CountryController( CountryDAO countryDAO) {
		this.countryDAO = countryDAO;
	}
	
	@GetMapping("/list")
	public String listCountries(Model theModel) {
		
		//get countries from db
		List<Country> theCountries = countryDAO.findAll();
		
		if(theCountries == null) {
			//display a message
		}
		// add the spring model
		theModel.addAttribute("countries", theCountries);
		
		return "countries/list-countries";
	}
	
	@GetMapping("/country")
	public String display(Model theModel) {
		return "HELLO";
	}

}
