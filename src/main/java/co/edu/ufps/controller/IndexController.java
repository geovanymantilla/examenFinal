package co.edu.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.ufps.entities.Basico;
import co.edu.ufps.repository.BasicoRepository;
import co.edu.ufps.repository.EpsRepository;
import co.edu.ufps.repository.ModalidadRepository;
import co.edu.ufps.repository.TipoRepository;

@Controller
public class IndexController {
	
	@Autowired
	BasicoRepository basicoRepository;
	
	@Autowired
	EpsRepository epsRepository;
	
	@Autowired
	ModalidadRepository modalidadRepository;
	
	@Autowired
	TipoRepository tipoRepository;
	
	 @GetMapping({"/"})
	    public String index(){
	        return "index";
	    }
	 
	 @GetMapping("/infoBasica/nuevo")
	 public String basica(Model model, Basico basico) {
		 
		 model.addAttribute("basico", basico);
		 model.addAttribute("eps", epsRepository.findAll());
		 model.addAttribute("modalidad", modalidadRepository.findAll());
		 model.addAttribute("tipo", tipoRepository.findAll());
		 
		 return("datospersonales");
	 }
	 
	 @PostMapping("/guardar")
	    public String guardar(Basico basico){	        
		 basicoRepository.save(basico);
	        return "redirect:/";
	    }

}
