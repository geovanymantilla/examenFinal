package co.edu.ufps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	 @GetMapping({"/index"})
	    public String index() {
	        return "login";        
	    }

}
