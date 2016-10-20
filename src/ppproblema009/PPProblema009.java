/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema009;
import java.util.*;

/**
 *
 * @author karen
 */
public class PPProblema009 {

    /**
     * @param args the command line arguments
     9.	Realiza un programa que reciba un número de 4 cifras y muestra sus cifras por separado, 
     * //ejemplo 4568 = 4000 + 500 + 60 + 8*/
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

		int numero, d1, d2, d3, d4, d5;

		System.out.print("\nIngrese un número de 4 dígitos: ");
		numero = input.nextInt();

		d1 = numero % 10;
		d2 = numero % 100 / 10;
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;

		System.out.print("\nEl número ingresado está compuesto por los siguiente dígitos:\n");
		System.out.printf("%d   %d   %d   %d   %d\n\n", d5,  d4, d3, d2, d1);
    
    }

}

    

    