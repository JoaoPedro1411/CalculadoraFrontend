package br.com.db1.calculadoraapi.calculadora_api.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.calculadoraapi.calculadora_api.model.Calculadora;
import br.com.db1.calculadoraapi.calculadora_api.model.OperacaoMatematica;
import br.com.db1.calculadoraapi.calculadora_api.repository.CalculadoraRepository;

@Service
public class CalculadoraService {
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaOperacao(Double num1, Double num2, OperacaoMatematica opm) {
		
		Calculadora calculadora = new Calculadora(num1, num2);
		calculadora.setOpm(opm);
		calculadora.setDataOperacao(LocalDateTime.now());
		calculadora.executaOperacao(opm);
		calculadoraRepository.save(calculadora);
		
		return calculadora;
		
	}
	
	public List<Calculadora> buscarTodosCalculos(){
		return calculadoraRepository.findAll();
	}

}
