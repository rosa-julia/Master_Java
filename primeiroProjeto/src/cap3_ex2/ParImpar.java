
package cap3_ex2;

import java.util.Scanner;


public class ParImpar {
    
    public void Comparar(){
        int numero = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        numero = scan.nextInt();
        
        if ( numero%2 == 0 ){
            System.out.println("O numero digitado eh par");
        }else { 
            System.out.println("O numero digitado eh impar");
            
        }
    }
}
