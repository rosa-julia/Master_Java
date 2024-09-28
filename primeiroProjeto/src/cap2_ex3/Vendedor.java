
package cap2_ex3;

import java.util.Scanner;

public class Vendedor {
    
   
    public static void main(String[] args) {
      
    String nome;
    double salarioBase;
    double totalVendas;
    double salarioTotal;
    
    Scanner scan = new Scanner(System.in);  
        
        System.out.println("Nome do vendedor: ");
        nome = scan.nextLine();
        System.out.println("Salario Base: ");
        salarioBase = scan.nextDouble();
        System.out.println("Total de vendas no mês: ");
        totalVendas = scan.nextInt();
        
        salarioTotal = salarioBase +(totalVendas * 0.5);
    
        System.out.println("Salario total: " + salarioTotal);
    }
    
}
