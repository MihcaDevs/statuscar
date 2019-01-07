package com.statuscar.statuscar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.statuscar.statuscar.model.Servico;
import com.statuscar.statuscar.repository.ServicoRepository;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	
	@RequestMapping(value="/cadastrarServico", method=RequestMethod.GET)
	public String formServico() {
		return"veiculo/formServico";
	}
	
	@RequestMapping(value="/cadastrarServico", method=RequestMethod.POST)
	public String form(Servico servico) {
		
		servicoRepository.save(servico);
		
		return"redirect:/cadastrarServico";
	}

}
