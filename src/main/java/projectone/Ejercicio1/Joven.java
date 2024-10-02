/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone.Ejercicio1;
import java.util.Scanner;  

/**
 * La clase Joven se utiliza para evaluar si una persona joven cumple ciertos
 * requisitos relacionados con su edad, nivel de estudios e ingresos, y
 * determinar si está "sobradamente preparado".
 * 
 * Condiciones:
 * - Edad menor o igual a 28.
 * - Nivel de estudios mayor que 3.
 * - Ingresos superiores a 28,000 euros.
 * 
 * La clase solicita la entrada de datos por consola y muestra si cumple o no
 * con los criterios definidos.
 * 
 * @author cherry
 */
public class Joven {
    
      /**
     * Método principal que ejecuta el programa para evaluar si el joven está
     * "sobradamente preparado" basándose en los valores ingresados por el usuario.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    
    public static void main (String[] args){
        int edad;
        int nivel_de_estudios;
        int ingresos; 
        //Creo un objeto de Scanner para pedir los datos:
        Scanner sc = new Scanner(System.in);
        
        //Preguntamos edad, nivel de estudios, ingresos:
        System.out.println("Introduce la edad: ");
         edad = sc.nextInt();
         
        System.out.println("Introduce nivel de estudios: ");
         nivel_de_estudios = sc.nextInt();
         
        System.out.println("Introduce los ingresos ");
        ingresos = sc.nextInt();
        
        /**
         * Se calcula si el joven cumple con los criterios para ser considerado
         * "sobradamente preparado".
         * 
         * - La edad debe ser menor o igual a 28.
         * - El nivel de estudios debe ser mayor que 3.
         * - Los ingresos deben superar los 28,000 euros.
         */
        //En vez de usar un if-else, usaremos la propia variable  booleana "jasp"
        boolean jasp = ((edad <= 28) && (nivel_de_estudios >3) && (ingresos > 28000) );
        
        // Podemos usar un operador ternario (? true : false) para que devuelva un texto si es verdadero o falso
        System.out.println("¿Está el joven sobradamente preparado? " + (jasp ? "Sí" : "No") );
        
               
    }
    
}
