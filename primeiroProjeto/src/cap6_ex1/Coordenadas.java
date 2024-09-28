
package cap6_ex1;

import java.util.Scanner;

public class Coordenadas {
    
    Scanner ler = new Scanner (System.in);
  
    double distancia;
    double x1,x2,y1,y2;
    
    public void calcularDistancia(){
//     lembrar de inserir as coordenadas com vírgula ao invés de ponto
        System.out.println("Digite a primeira abscissa: ");
        x1 = ler.nextDouble();
        System.out.println("Digite a primeira ordenada: ");
        y1 = ler.nextDouble();
        System.out.println("Digite a segunda abscissa: ");
        x2 = ler.nextDouble();
        System.out.println("Digite a segunda ordenada: ");
        y2 = ler.nextDouble();
        
   
        distancia = Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2-y1, 2));
        System.out.println("A distancia entre os dois pontos eh: "+ distancia * 100);
        
        
    } 
    
        
}
