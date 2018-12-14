package br.com.db1.calculadoraapi.calculadora_api.dto;

import br.com.db1.calculadoraapi.calculadora_api.model.OperacaoMatematica;

public class CalculadoraDTO {
	
	private OperacaoMatematica opm;
	
	private Double num1;
	
	private Double num2;

	public OperacaoMatematica getOpm() {
		return opm;
	}

	public void setOpm(OperacaoMatematica opm) {
		this.opm = opm;
	}

	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	

}
