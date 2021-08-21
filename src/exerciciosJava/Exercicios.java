package exerciciosJava;
//	---------------------		Criado por: Denilson Araujo		---------------------	//
//	---------------------		       @Denilson_fa       		---------------------	//

public class Exercicios {
	
	private int op;
	public static int option;
	private double resultD;
	private String resultS;
	
	public String[] exerciciosText = {
			"Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, adicionando um aumento de 25%.",
			"Faça um programa que calcule e mostre a área de um triângulo.",
			"Faça um programa que solicite ao usuário a entrada de 5 números inteiros e imprima como resultado a soma de todos os ímpares",
			"Faça um programa que solicite ao usuário a entrada de 5 números inteiros e imprima como resultado a soma de todos os pares",
			"Construa um programa que exiba a tabuada de 1 até N, onde N é o número informado pelo usuário",
			"Faça um programa que receba como entrada um valor inteiro e apresente como resultado o seu fatoria",
			"Escreva um programa que leia 2 notas de um aluno, ele deverá calcular a média ponderada utilizando a seguinte fórmula: Media = (N1*2 + N2*3)/2+3. A partir da média, informar sua situação.",
			"Faça um programa que receba um valor inteiro e informe se ele é um número primo: ",
			"Faça um programa que solicite ao usuário um número e gere como saída todo os números primos entre 1 e o número informado",
			"Faça um programa que solicite ao usuário um número de 1 a 10 e gere como saída o produto dos números pares compreendidos entre 1 e o número informado",
			"Faça um programa que solicite ao usuário um número e apresente como resultado a média de todos os números pares e ímpares",
			"Faça um programa que solicite ao usuário 5 números e apresente como saída: o maior e o menor"
	};
	
	public String[] exerciciosNum = {
			"Exercicio 01",
			"Exercicio 02",
			"Exercicio 03",
			"Exercicio 04",
			"Exercicio 05",
			"Exercicio 06",
			"Exercicio 07",
			"Exercicio 10",
			"Exercicio 11",
			"Exercicio 12",
			"Exercicio 13",
			"Exercicio 14"
	};
	
	public String exercicioVasio = "Selecione um exercicio!";
	
	public Exercicios() {}
	public int getOp() { return op; }
	public void setOp(int op) { this.op = op; }

	
	public double exercicio01(double salario) {
		//Faça um programa que receba o salário de um funcionário, 
		//calcule e mostre o novo salário, adicionando um aumento de 25%
		return resultD = salario*1.25;
	}
	
	public double exercicio02(double base, double altura) {
		//Faça um programa que calcule e mostre a área de um triângulo. 
		return resultD = (base*altura)/2;
	}
	
	public double exercicio03(int[] num) {
		//Faça um programa que solicite ao usuário a entrada de 5 números inteiros e imprima
		//como resultado a soma de todos os ímpares
		for(int i = 0; i < num.length; i++) {
			if(num[i]%2 != 0) { resultD += num[i]; }
		}
		return resultD;
	}
	
	public double exercicio04(int[] num) {
		//Faça um programa que solicite ao usuário a entrada de 5 números inteiros e imprima
		//como resultado a soma de todos os pares
		for(int i = 0; i < num.length; i++) {
			if(num[i]%2 == 0) { resultD += num[i]; }
		}
		return resultD;
	}
	
	public String exercicio05(int num) {
		//Construa um programa que exiba a tabuada de 1 até N, 
		//onde N é o número informado pelo usuário
		resultS = "";
		
		for(int x = 0; x <= num; x++) {
			for(int y = 0; y <= 10; y++) {
				resultS = resultS+y+" × "+x+" = "+y*x+"\n";
			}
			resultS = resultS+"\n";
		}
		return resultS;
	}
	
	public long exercicio06(long num)  {
		//Faça um programa que receba como entrada um valor inteiro e apresente como
		//resultado o seu fatorial
		if (num <=1 ) {
			return 1; 
		} else {
			return num * exercicio06(num - 1);
		}
	}
	
	public String exercicio07(int num1, int num2) {
		//Escreva um programa que leia 2 notas de um aluno, ele deverá calcular a média
		//ponderada utilizando a seguinte fórmula: Media = (N1*2 + N2*3)/2+3. A partir da média,
		//informar sua situação de acordo com o seguinte critério:
		//Se média >= 6 – Aluno aprovado
		//Se média < 6 - Aluno reprovado
		
		double media = (num1*2 + num2*3) / (2+3);
		
		resultS = (media >= 6) ? "Aluno aprovado!!!" : "Aluno REPROVADO!!!";
		return "Media: "+media+" | "+resultS;
		
	}
	
	public boolean exercicio10(int num) {
		//Faça um programa que receba um valor inteiro e informe se ele é um número primo
		boolean result = false;
	    for (int j = 2; j < num; j++) {
	    	result = (num % j == 0) ? false : true;
	    }
	    return result;
	}
	
	public String exercicio11(double num) {
		//Faça um programa que solicite ao usuário um número e gere como saída todo os
		//números primos entre 1 e o número informado
		resultS = "";
        for(int a = 0;a<=num;a++) {
        	if(a%2==1) {resultS = resultS+a+", ";}
            //if(a%2==1) { System.out.println(+a); }
        }
		return resultS;
	}
	
//	public String exercicio12(double num) {
//		//Faça um programa que solicite ao usuário um número de 1 a 10 e gere como saída o
//		//produto dos números pares compreendidos entre 1 e o número informado
//		resultD = 1;
//		if(num >= 1 && num <= 10) {
//			for(int i = 1; i <= num; i += 2) {
//				resultD = i * resultD;
//			}
//			resultS = "O produto do numero "+num+" é: "+resultD;
//		} else {
//			resultS = "ERRO: O numero não está entre 1 e 10!!!";
//		}
//		
//		return resultS;
//		
//	}
	
	public String exercicio13(int num) {
		//Faça um programa que solicite ao usuário um número e apresente como resultado
		//a média de todos os números pares e ímpares
		int nP = 0, nI = 0, n = 0;
		int mP = 0, mI = 0;
		for(int i = 0; i <= num; i ++) {
			if(i%2 == 0) {
				nP = i + nP;
				mP++;
			} else {
				nI = i + nI;
				mI++;
			}
			n = i + n;
		}
		
		return "Media dos Numeros Pares: "+nP/mP
				+"\nMedia dos Numeros Impares: "+nI/mI
				+"\nMedia total: "+n/num;
	}
	
	public int exercicio14(int[] num) {
		//Faça um programa que solicite ao usuário 5 números e apresente como saída:
		//o maior e o menor
		int maior = 0;
		for(int i = 0; i < num.length; i++) {
			if(maior < num[i]) { maior = num[i]; }
		}
		return maior;
	}

}
