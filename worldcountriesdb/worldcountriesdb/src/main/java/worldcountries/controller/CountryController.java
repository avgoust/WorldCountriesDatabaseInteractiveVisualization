package worldcountries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import worldcountries.model.Country;
import worldcountries.dao.CountryDAO;

@Controller
@RequestMapping(path = "/countries")
public class CountryController {
	
	@Autowired
	private Country country;
	
	@Autowired
	public CountryController( Country country) {
		this.country = country;
	}

}
