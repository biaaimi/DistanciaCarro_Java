package exercicios;

import java.util.Scanner;

public class combustivel {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double TaxaDeConsumo;
		double km1;
		double km2;
		double kmTotal;
		double litros;
		
		
		System.out.print("Informe o KM inicial:  ");
		km1= input.nextDouble();
		
		System.out.print("Informe o KM final:  ");
		km2 = input.nextDouble();
		
		System.out.print("Informe a quantidade de litros consumidos:  ");
		litros = input.nextDouble();
		
		
		
		kmTotal = km2 - km1;
		
		TaxaDeConsumo = kmTotal/litros;
		
		System.out.println("O total percorrido foi de " + kmTotal + "KM");
		System.out.println("A taxa media de consumo é de " + TaxaDeConsumo + "litros por KM percorrido");
		
		
		
	
	
	}

}
