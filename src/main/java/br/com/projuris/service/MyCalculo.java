package br.com.projuris.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.projuris.model.CustoCargo;
import br.com.projuris.model.CustoDepartamento;
import br.com.projuris.model.Funcionario;
import br.com.projuris.repository.CalculoRepository;

@Service
public class MyCalculo implements CalculoRepository {
	
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		
		List<CustoCargo> custoCargoList = new ArrayList<>();
				
		funcionarios.stream().collect(
				Collectors.groupingBy(Funcionario::getCargo, Collectors.reducing(BigDecimal.ZERO, Funcionario::getSalario, BigDecimal::add))
				).forEach((cargo, custo) -> {
					CustoCargo custoCargo = new CustoCargo(cargo, custo);
					custoCargoList.add(custoCargo);
					}
				);			
		
		return custoCargoList;
	}
	
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {

		List<CustoDepartamento> custoDepartamentoList = new ArrayList<>();
		
		funcionarios.stream().collect(
				Collectors.groupingBy(Funcionario::getDepartamento, Collectors.reducing(BigDecimal.ZERO, Funcionario::getSalario, BigDecimal::add))
				).forEach((departamento, custo) -> {
					CustoDepartamento custoDepartamento = new CustoDepartamento(departamento, custo);
					custoDepartamentoList.add(custoDepartamento);
					}
				);					
		
		return custoDepartamentoList;
	}

}
