package it.scalesse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value = "/controlloAzione")
	public ModelAndView checkOperazione(@RequestParam("operazione") String operazione, Model model) {
    
	  return new ModelAndView("selezionaNumeri","operazione",operazione);

	}
	
	
	@RequestMapping(value = "/eseguiOperazione")
	public ModelAndView eseguiOperazione(@RequestParam("operazione") String operazione,@RequestParam("primo") int primo,
			
			@RequestParam("secondo") int secondo, Model model) {
    
	     double risultato=0;
		switch (Integer.parseInt(operazione)) {
		
		case 0: risultato=primo+secondo;
	    break;
		case 1: risultato=primo-secondo;
	    break;
		case 2: risultato=primo*secondo;
	    break;
		case 3: risultato=primo/secondo;
	    break;

		}
		
		return new ModelAndView("risultato","risultato",risultato);

	}

}
