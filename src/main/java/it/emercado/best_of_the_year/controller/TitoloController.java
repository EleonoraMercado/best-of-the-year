package it.emercado.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.emercado.best_of_the_year.model.Utente;

@Controller
public class TitoloController {

	@GetMapping("/")
	public String premiatoDellAnno(@RequestParam(name = "name", required = false)String name, Model model) {
		
		Utente eleonora = new Utente("Eleonora", "Mercado");
		
		model.addAttribute(eleonora);
		return "/titolo";
		
		
	}
}
