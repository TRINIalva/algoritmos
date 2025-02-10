package trini2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		sc.close();
		for(int i=0; i<numero; i++) {
			System.out.print(" " + fibonaci(i));
		
		}	System.out.println("\nSu Fibonacci es: " + fibonaci(numero));
		



	}
	
	public static int fibonaci(int numero) {
		if((numero==0)||(numero==1) ) {
			return numero;
		} else {
			return fibonaci(numero -1 ) + fibonaci (numero - 2);
		}
	}

}
