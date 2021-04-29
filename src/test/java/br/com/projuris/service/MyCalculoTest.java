package br.com.projuris.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import br.com.projuris.model.CustoCargo;
import br.com.projuris.model.CustoDepartamento;
import br.com.projuris.model.Funcionario;

public class MyCalculoTest {
	
	private MyCalculo myCalculo = new MyCalculo();
	static List<Funcionario> listFuncionario = new ArrayList<>();
	
	@BeforeAll
	static void beforeAll() {
		listFuncionario.add( new Funcionario("Assistente", "Administrativo", new BigDecimal("1000.0")));
		listFuncionario.add( new Funcionario("Gerente", "Administrativo", new BigDecimal("7000.70")));
		listFuncionario.add( new Funcionario("Diretor", "Administrativo", new BigDecimal("10000.45")));
		listFuncionario.add( new Funcionario("Assistente", "Financeiro", new BigDecimal("1300.9")));
		listFuncionario.add( new Funcionario("Gerente", "Financeiro", new BigDecimal("7500")));
		listFuncionario.add( new Funcionario("Diretor", "Financeiro", new BigDecimal("11000.0")));
		listFuncionario.add( new Funcionario("Estagiário", "Jurídico", new BigDecimal("700.4")));
		listFuncionario.add( new Funcionario("Assistente", "Jurídico", new BigDecimal("1800.90")));
		listFuncionario.add( new Funcionario("Gerente", "Jurídico", new BigDecimal("9500.50")));
		listFuncionario.add( new Funcionario("Diretor", "Jurídico", new BigDecimal("13000.0")));
	}
		
	@Test
	public void calculoCustoCargoHappyDayTest() {
				
		List<CustoCargo> custoCargoList = this.myCalculo.custoPorCargo(listFuncionario);
		
		this.checkCargo(custoCargoList, "Estagiário", new BigDecimal("700.4"));
		this.checkCargo(custoCargoList, "Diretor", new BigDecimal("34000.45"));
		this.checkCargo(custoCargoList, "Gerente", new BigDecimal("24001.20"));
		this.checkCargo(custoCargoList, "Assistente", new BigDecimal("4101.80"));	
	}
	
	@Test
	public void calculoCustoDepartamentoHappyDayTest() {
				
		List<CustoDepartamento> custoDepartamentoList = this.myCalculo.custoPorDepartamento(listFuncionario);
		
		this.checkDepartamento(custoDepartamentoList, "Administrativo", new BigDecimal("18001.15"));
		this.checkDepartamento(custoDepartamentoList, "Financeiro", new BigDecimal("19800.9"));
		this.checkDepartamento(custoDepartamentoList, "Jurídico", new BigDecimal("25001.80"));		
	}
	
	private void checkCargo(List<CustoCargo> custoCargoList, String cargo, BigDecimal total ) {
		CustoCargo custoCargo = custoCargoList.stream().filter(el -> el.getCargo().equals(cargo)).findAny().get();
		assertEquals(custoCargo.getCusto(), total);
	}
	
	private void checkDepartamento(List<CustoDepartamento> custoDepartamentoList, String departamento, BigDecimal total ) {
		CustoDepartamento custoDepartamento = custoDepartamentoList.stream().filter(el -> el.getDepartamento().equals(departamento)).findAny().get();
		assertEquals(custoDepartamento.getCusto(), total);
	}
}
