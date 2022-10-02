# U1-HOJA-Ejercicios-3
Los arboles no dejan ver el bosque, en JAVA..

![3](https://user-images.githubusercontent.com/80227002/193471226-111a5291-2f8b-44f7-86b7-989bbd1f5d00.png)

```java
/**
 * pag 16, ejercicio 3. 
 * El tipo short permite almacenar valores comprendidos entre -32768 y 32767. 
   Escribir un programa que compruebe el rango de valores de un tipo se 
   comporta de forma cíclica, es decir, el valor siguiente al máximo es el 
   valor mínimo.
 */
 
public class U1-HOJA-Ejercicios-3 {
    public static void main(String[] args) {
        short num=32767; 
         System.out.print("maximo: "+(+num));        
         num ++;
         System.out.print("aumentado: "+(num+1)+".\n\n");
    }
}
```

