package br.com.db1.calculadoraapi.calculadora_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.calculadoraapi.calculadora_api.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {

}
