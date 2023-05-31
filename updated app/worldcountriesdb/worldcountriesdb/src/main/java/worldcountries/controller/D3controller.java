package worldcountries.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class D3controller {
    @RequestMapping("/LoadCsvToD3BarChart")
    public String staticCsvForD3() {
        return "/LoadCsvToD3BarChart";
    }

}
