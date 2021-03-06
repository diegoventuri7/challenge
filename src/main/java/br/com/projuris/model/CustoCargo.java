package br.com.projuris.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;

@ApiModel("Cost per job position")
public class CustoCargo {
	private String cargo;
	private BigDecimal custo;
	
	public CustoCargo(String cargo, BigDecimal custo) {
		super();
		this.cargo = cargo;
		this.custo = custo;
	} 
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public BigDecimal getCusto() {
		return custo;
	}
	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}	
}
