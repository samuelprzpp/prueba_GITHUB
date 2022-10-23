
package Obrero;

import java.util.Scanner;


public class Main {
//Un obrero necesita calcular su salario semanal y se obtiene de la siguiente manera
//Si trabajar 40 horas o menos se le paga $16 x hora
//Si trabaja mas de 40 se le paga lo mismo pero $20 dolares por cada hora extra luego de las 40 horas
    
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);     
   int horasTrabajadas, hExtra;
   double salario;
   
   System.out.println("             INDUSTRIAS  TOPAZ                   ");
   System.out.println("Digite el numero de horas que trabajo");
   horasTrabajadas = sc.nextInt();
   hExtra = horasTrabajadas - 40;
   
        if (horasTrabajadas <= 40 ) {
            
            salario = horasTrabajadas * 16;
        }
        else{
           
         salario = (40* 16)  + (hExtra * 20);
            
        }
        System.out.println("La horas tabajadas son : " + horasTrabajadas);
        System.out.println("SALARIO TOTAL :" + salario);
    }
    
}
