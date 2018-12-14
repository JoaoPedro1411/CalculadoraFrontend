package br.com.db1.calculadoraapi.calculadora_api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculadora")
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "num1", nullable = false, length = 4)
	private Double num1;

	@Column(name = "num2", nullable = false, length = 4)
	private Double num2;

	@Enumerated
	@Column(name = "opm", nullable = false, length = 4)
	private OperacaoMatematica opm;

	@Column(name = "dataOperacao", nullable = false, length = 10)
	private LocalDateTime dataOperacao;

	@Column(name = "resultado", nullable = false, length = 10)
	private Double resultado;

	public Calculadora(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void executaOperacao(OperacaoMatematica opm) {
		this.opm = opm;
		resultado = opm.executar(this.num1, this.num2);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public OperacaoMatematica getOpm() {
		return opm;
	}

	public void setOpm(OperacaoMatematica opm) {
		this.opm = opm;
	}

	public LocalDateTime getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(LocalDateTime dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	public Calculadora() {
		
	}

}
