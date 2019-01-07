package com.statuscar.statuscar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.statuscar.statuscar.model.Veiculo;
import com.statuscar.statuscar.repository.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	
	
	
	
	@RequestMapping(value="/cadastrarVeiculo", method=RequestMethod.GET)
	public String form() {
		return"veiculo/formVeiculo";
	}
	
	@RequestMapping(value="/cadastrarVeiculo", method=RequestMethod.POST)
	public String form(Veiculo veiculo) {
		
		veiculoRepository.save(veiculo);
		
		return"redirect:/cadastrarVeiculo";
	}
	
	
	
	

}
