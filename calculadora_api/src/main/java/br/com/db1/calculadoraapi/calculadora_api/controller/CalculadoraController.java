package br.com.db1.calculadoraapi.calculadora_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadoraapi.calculadora_api.dto.CalculadoraDTO;
import br.com.db1.calculadoraapi.calculadora_api.model.Calculadora;
import br.com.db1.calculadoraapi.calculadora_api.model.OperacaoMatematica;
import br.com.db1.calculadoraapi.calculadora_api.service.CalculadoraService;

@CrossOrigin("*")
@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@PostMapping
	public Calculadora salvaOperacao(@RequestBody CalculadoraDTO calculo) {

		Calculadora calculadora = calculadoraService.salvaOperacao(calculo.getNum1(), calculo.getNum2(),
				calculo.getOpm());
		return calculadora;

	}

	@GetMapping
	public List<Calculadora> todosCalculos() {
		return calculadoraService.buscarTodosCalculos();
	}

}
