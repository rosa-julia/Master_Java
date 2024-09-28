
package cap3_ex1;

import java.util.Scanner;

/**
 *
 * @author Prog
 */
public class VerificaNumero {
      
       public void compararNumeros(){
           
           int num1,num2;
           Scanner scan = new Scanner(System.in);
           
           System.out.println("Digite dois números: ");
           num1 = scan.nextInt();
           num2 = scan.nextInt();
           
           if (num1 > num2) {
               System.out.println("O primeiro numero eh maior que o segundo numero");
           } else if (num2 > num1) {
               System.out.println("O segundo numero eh maior que o primeiro numero ");
           } else 
               System.out.println("Os numeros sao iguais");
           
       }
   
}
