package br.com.projuris.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;

@ApiModel("Employees")
public class Funcionario {
	
	private String cargo;
	private String departamento;
	private BigDecimal salario;
	
	public Funcionario(String cargo, String depargamento, BigDecimal salario) {
		this.cargo = cargo;
		this.departamento = depargamento;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}
