package trini2;

import java.util.Scanner;

public class Invertirunacadena {

	 public static String Invertircadena(String cadena, int beginindex) {
    if(cadena.isEmpty()) {
    	return cadena;
    }	 else {
    	return Invertircadena(cadena.substring(beginindex + 1), beginindex) + cadena.charAt(0);
    }
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String cadena=sc.nextLine();
		System.out.println("La cadena invertida es: " + Invertircadena(cadena,0));
sc.close();
	}
    

}
