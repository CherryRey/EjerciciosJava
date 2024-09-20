/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone.Ejercicio1;
import java.util.Scanner; 

/**
 *
 * @author cherry
 * 
 * Recibir un número y determinar si es multiplo de 3.
 * El numero debe estar comprendido del uno al 10;
 */
public class multiplos3 {
            public static void main (String[] args){
                
                //Introducir número
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce un número : ");
                
                int numero = sc.nextInt();                
                
               if (numero <=10 && numero >=0){
                    if (numero % 3 == 0){
                System.out.println( "El numero  " + numero+" es multiplo de 3");}
                     else
                    {System.out.println( "El numero " + numero+" NO es multiplo de 3");}
               }
               else {System.out.println( "El numero debe ser mayor o igual que cero y menor de 10");}
                sc.close();
            
            }
}
