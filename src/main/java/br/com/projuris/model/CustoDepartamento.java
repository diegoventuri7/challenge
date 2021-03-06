package br.com.projuris.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;

@ApiModel("Cost per department")
public class CustoDepartamento {
	private String departamento;
	private BigDecimal custo;
	
	public CustoDepartamento(String departamento, BigDecimal custo) {
		super();
		this.departamento = departamento;
		this.custo = custo;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public BigDecimal getCusto() {
		return custo;
	}	
	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}
}
