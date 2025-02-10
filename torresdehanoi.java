package trini2;

import java.util.Scanner;

public class torresdehanoi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		System.out.println("Introduce el numero de discos de la torre:");
		numero=sc.nextInt();
		Hanoi(numero, 1, 2, 3);
		

	}
	 public static void Hanoi(int numeroDiscos,int origen, int auxiliar, int destino) {
		 if(numeroDiscos==1) {
			 System.out.println("- Mover Disco de " + origen + " a " + destino);
		 } else {
			 Hanoi(numeroDiscos - 1, origen, destino, auxiliar); 
			 System.out.println("- Mover disco de " + origen + " a " + destino);
			 Hanoi(numeroDiscos - 1, auxiliar, origen, destino );
			 
		 }
		 
	 }

}
