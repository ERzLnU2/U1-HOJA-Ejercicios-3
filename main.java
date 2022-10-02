/**
   pag 16, Ejercicio 3. 
  
 * El tipo short permite almacenar valores comprendidos entre -32768 y 32767. 
   Escribir un programa que compruebe el rango de valores de un tipo se 
   comporta de forma cíclica, es decir, el valor siguiente al máximo es el 
   valor mínimo.
   
   @author Daw120
 */
package com.solomongo.ejercicio3_daw120;
public class Ejercicio3_DAW120 {
    public static void main(String[] args) {
        short num=32767; //definir variable y asignar valor  
         // dos maneras, esta saca el resultado en pantalla:
         //System.out.println("Dentro de un año tendras.."+edadAlgo);
         // esta es la misma que arriba pero hace la operacion al final, en la salida:
         System.out.print("\nSi el numero short maximo es: "+(+num));        
         num ++; // aumento
         System.out.print(".\nSu valor aumentado (minimo) sera.. "+(num+1)+".\n\n");
    }
}
