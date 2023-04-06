package com.br.nmap.nmap.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.br.nmap.nmap.service.NmapService;

@Controller
public class NmapController {
	
	@Autowired
	private NmapService nmapService;

	@GetMapping("/nmap")
	public ModelAndView nmap() {
		ModelAndView modelAndView = new ModelAndView("nmap-home");
		nmapService.stopScan();
		return modelAndView; 
	}

	 @PostMapping("/nmap")
	    public ModelAndView scan(@RequestParam String ip, Model model) throws IOException {
		 ModelAndView modelAndView = new ModelAndView("nmap-home");
		 nmapService.PortScanner(ip);
		 return modelAndView;
	    }
	 
	 @GetMapping("/get-output")
	 public @ResponseBody String getOutput() {
	     return nmapService.getOutput();
	 }
	 
	 @PostMapping("/stop-scan")
	 public ModelAndView stopScan() {
		 ModelAndView modelAndView = new ModelAndView("nmap-home");
			
	     nmapService.stopScan(); 
	     
	     return modelAndView; 
	 }

}