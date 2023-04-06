package com.br.nmap.nmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/cibersecurity")
public class PagesController {
	
	@GetMapping("/ataques")
	public ModelAndView ataques() {
		ModelAndView modelAndView = new ModelAndView("ataques-cybersecurity");
		return modelAndView; 
	}
	
	@GetMapping("/conceitos")
	public ModelAndView conceitos() {
		ModelAndView modelAndView = new ModelAndView("conceitos-pentest");
		return modelAndView; 
	}
	
	@GetMapping("/ferramentas")
	public ModelAndView ferramentas() {
		ModelAndView modelAndView = new ModelAndView("ferramentas-cybersecurity");
		return modelAndView; 
	}
	
	@GetMapping("/linux")
	public ModelAndView linux() {
		ModelAndView modelAndView = new ModelAndView("linux-cybersecurity");
		return modelAndView; 
	}
	
	@GetMapping("/pilares")
	public ModelAndView pilares() {
		ModelAndView modelAndView = new ModelAndView("pilares-seguranca");
		return modelAndView; 
	}
	
	@GetMapping("/redes")
	public ModelAndView redes() {
		ModelAndView modelAndView = new ModelAndView("redes-cybersecurity");
		return modelAndView; 
	}
	
	@GetMapping("/sites")
	public ModelAndView sites() {
		ModelAndView modelAndView = new ModelAndView("sites-cybersecurity");
		return modelAndView; 
	}

}
