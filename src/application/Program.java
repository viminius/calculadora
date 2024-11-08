package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Double a, b;
		char op;
		
		System.out.println("Digite o valor 1: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor 2: ");
		b = sc.nextDouble();
		
		System.out.println("Qual operação será realizada? (digite o sinal da operação)");
		op = sc.next().charAt(0);
			if (op == '+') {
				double sum = 0.0;
				sum = a + b;
				System.out.println("Resultado da soma: " + sum);
			}
			else if (op == '-') {
				double sub = 0.0;
				sub = a - b;
				System.out.println("Resultado da subtração: " + sub);
			}
			else if (op == '*') {
				double mult = 0.0;
				mult = a * b;
				System.out.println("Resultado da subtração: " + mult);
			}
			else if (op == '/') {
				double div = 0.0;
				div = a / b;
				System.out.println("Resultado da subtração: " + div);
			}

		sc.close();
	}
}
