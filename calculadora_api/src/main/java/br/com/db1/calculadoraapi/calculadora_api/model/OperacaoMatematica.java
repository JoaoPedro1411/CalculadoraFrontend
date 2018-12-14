package br.com.db1.calculadoraapi.calculadora_api.model;

public enum OperacaoMatematica {
	SOMA {
		@Override
		public Double executar(Double num1, Double num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public Double executar(Double num1, Double num2) {
			return num1 - num2;
		}
	},
	DIVISAO {
		@Override
		public Double executar(Double num1, Double num2) {
			return num1 / num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double executar(Double num1, Double num2) {
			return num1 * num2;
		}
	};

	public abstract Double executar(Double num1, Double num2);

}
