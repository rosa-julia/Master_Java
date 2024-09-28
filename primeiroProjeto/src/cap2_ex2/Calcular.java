package cap2_ex2;

import java.util.Scanner;

public class Calcular {
    
    public static void main(String[] args) {
        
        int A,B,C,D,resultado;
        
        Scanner objscan  = new Scanner(System.in); 
        
        System.out.println("Insira o valor de A:");
        A = objscan .nextInt();
        System.out.println("Insira o valor de B:");
        B = objscan .nextInt();
        System.out.println("Insira o valor de C:");
        C = objscan .nextInt();
        System.out.println("Insira o valor de D:");
        D = objscan .nextInt();
        
        resultado = (A*B)-(C*D);
        
        System.out.println("Resultado: " +resultado);
        
        
    }
    
}
