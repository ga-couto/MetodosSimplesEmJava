package com.dio;

public class Calculadora {
	
	public static void soma(double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A soma de          "+ num1 +" com "+ num2+ " -> "+resultado);
	}
	
	public static void subtracao(double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("A subtracao de     "+ num1 +" com "+ num2+ " -> "+resultado);
	}
	
	public static void multiplicacao(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("A multiplicacao de "+ num1 +" com "+ num2+ " -> "+resultado);
	}
	
	public static void divisao(double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println("A divisao de       "+ num1 +" com "+ num2+ " -> "+resultado);
	}
}
