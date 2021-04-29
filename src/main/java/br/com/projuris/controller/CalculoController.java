package br.com.projuris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projuris.model.CustoCargo;
import br.com.projuris.model.CustoDepartamento;
import br.com.projuris.model.Funcionario;
import br.com.projuris.service.MyCalculo;

@RestController
@RequestMapping("/calculo")
public class CalculoController {
	
	@Autowired
	private MyCalculo myCalculo;
	
	@PostMapping(path = "/cargo")
	public List<CustoCargo> calculoCustoCargo(@RequestBody List<Funcionario> body){
		return this.myCalculo.custoPorCargo(body);
	}
	
	@PostMapping(path = "/departamento")
	public List<CustoDepartamento> calculoCustoDepartamento(@RequestBody List<Funcionario> body){
		return this.myCalculo.custoPorDepartamento(body);
	}
}
