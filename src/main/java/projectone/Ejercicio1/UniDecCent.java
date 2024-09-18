/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone.Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Cherry Reynoso
 * 
 * Clase para descomponer un número en: unidades, decenas, centenas, 
 * unidades de Millar y decenas de millar.
 * 
 * Si la cifra dada es menor que 0 o contiene más de 5 cifras, 
 * vuelve a pedir el número.ú
 * 
 */
public class UniDecCent {
    public static void main (String[] args){
        //Solicitamos el numero. Usamos el modulo Scanner:
        
        //1. Creamos un objeto scanner que almacenara los datos
        Scanner sc = new Scanner(System.in);
        
        //2. Como quiero validar los datos (que no sea cifra > 5 digitos. 
        //2.1 Declaro la variable donde guardaré el número recibido.
        int numero; 
        
        //2.2 Creo un do-while. Si la condición if se cumple, el ciclo se repite
        
        do{
            //Con una leyenda pido los datos:
            System.out.println("Por favor, introduce un número de máximo 5 cifras: ");
            //Guardo el valor en mi variable "numero" anteriormente declarada en sc
            numero = sc.nextInt();
            
            //Valido cifra con un if
            if (numero >= 100000 || numero < 0){
                System.out.println("El numero no puede ser inferior a 5 cifras ni ser 0.");

            }
        } 
        //Mientras está condición se cumpla, el ciclo se repite.
        while(numero >= 100000 || numero < 0);
 
        
        //3. Declaro variable para descomponer el numero y almacenar resultados.
        int unidades, centenas, decenas, udMillar, dcMillar;
        
        unidades = numero %10;
        decenas = (numero/10)%10;
        centenas = (numero/100)%10;
        udMillar = (numero/1000) % 10;
        dcMillar = (numero/10000)%10;
        
        System.out.println("Las unidades de "+numero+" son: "+unidades);
        System.out.println("Las decenas de "+numero+" son: "+decenas);
        System.out.println("Las centenas de "+numero+" son: "+centenas);
        System.out.println("Las unidades de Millar de "+numero+" son: "+udMillar);
        System.out.println("Las decenas de Millar de "+numero+" son: "+dcMillar);
        
        System.out.println(unidades + " ud, "+decenas+ " dec, "+centenas+" cent, "
                + ""+udMillar+" ud Millar, "+dcMillar+" dec de Millar.");
        
        sc.close();
        
    }
    
    
}
