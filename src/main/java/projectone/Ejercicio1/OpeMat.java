/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projectone.Ejercicio1;
import java.util.Scanner;


/**
 *
 * @author cherry
 */
public class OpeMat {

    public static void main(String[] args) {
        //Creo un objeto de la clase "Scanner" para pedir datos
        Scanner sc = new Scanner(System.in);
        //Pido un número:
        System.out.println("Por favor, introduce el primer número");
        double uno = sc.nextDouble();
        System.out.println("Por favor, introduce el segundo número");
        double dos = sc.nextDouble();
        
        calculando(uno, dos);
        
        sc.close();
    }
    
    private static void calculando(double uno, double dos){
             
       double suma = uno + dos;
       double resta = uno - dos;
       double multiplicacion = uno * dos;
       double division = uno / dos;
       double raizCuadrada = Math.sqrt(uno);
       double raizCuadrada2 = Math.sqrt(dos);
       double potencia = Math.pow(uno,2);
       double potencia2 = Math.pow(dos,2);
       
       System.out.println("\n"+"La suma de "+uno+" + "+dos+" = "+suma+"\n");
       System.out.println("La resta de "+uno+" - "+dos+" = "+resta);
       System.out.println("La multiplicación de "+uno+" * "+dos+" = "+multiplicacion);
       System.out.println("La división de "+uno+" / "+dos+" = "+division);
       System.out.println("La raíz cuadrada de "+uno+" = "+raizCuadrada);
       System.out.println("La raíz cuadrada de "+dos+" = "+raizCuadrada2);
       System.out.println("La potencia de "+uno+" = "+potencia);
       System.out.println("La potencia de "+dos+" = "+potencia2);
       
       
       
    }
}
