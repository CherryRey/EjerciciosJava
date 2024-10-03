/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone.Ejercicio1;
import java.util.Scanner;

/**
 *
 * Realiza un programa en Java que dadas dos variables a y b, intercambie los
valores de a y b. Diseña el programa de modo que se pidan por teclado los valores de
a y b y se devuelvan por pantalla intercambiados.
 * @author cherry
 */
public class intercambio {
    public static void main(String [] args){
    // variables
    int a;
    int b;
    int temporal; 
    //objeto scanner
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Número 1:");
    a = sc.nextInt();
    
    System.out.println("Número 2:");
    b =sc.nextInt();
    
    System.out.println("Antes el numero 1 era: "+a+" y el numero 2: "+b);
    // con variable temporal
     //temporal = a;
     //a= b;
     //b = temporal;      
    // con Método XOR. Lee el binario de cada numero, así va comparando bit x bit. Si uno es distinto 1, si uno es igual 0. Por lo que siempre queda igual.
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    
    System.out.println("Ahora el numero 1 es: "+a+" y el numero 2 es : "+b);
    }
    
    
}
