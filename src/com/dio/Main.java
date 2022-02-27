package com.dio;

public class Main {

	
	public static void main(String[] args) {

		//Testando a calculadora
		System.out.println("Obtendo resultados da Classe Calculadora");
		Calculadora.soma(2, 4);
		Calculadora.subtracao(2, 4);
		Calculadora.multiplicacao(2, 4);
		Calculadora.divisao(2, 4);

		//Testando as mensages
		System.out.println("Obtendo mensagens da Classe mensagens");
		Mensagem.obterMensagem(6);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(24);
		Mensagem.obterMensagem(25);
		
		//Calculando empréstimo
		System.out.println("Calculando taxa de empréstimo");
		Emprestimo.Calcular(1000, 3);
		Emprestimo.Calcular(1000, 2);
		Emprestimo.Calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.Calcular(1000, 5);
		
		//Calculando areas
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Area total do Quadrado é -> "+ areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(3,4);
		System.out.println("Area total do Retangulo é -> "+ areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(3, 8, 7);
		System.out.println("Area total do Trapezio é -> "+ areaTrapezio);
		
	}

}
