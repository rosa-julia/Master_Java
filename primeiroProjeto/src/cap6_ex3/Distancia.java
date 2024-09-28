
package cap6_ex3;

import java.util.Scanner;

 
public class Distancia {
    
    Scanner ler = new Scanner (System.in);
    
    public void CalculaDistancia(double x1 ,double y1 ,double x2, double y2, double distancia){
        
        System.out.println("Digite o X do primeiro ponto");
        x1 = ler.nextDouble();
        System.out.println("Digite o Y do primeiro ponto");
        y1 = ler.nextDouble();
        System.out.println("Digite o X do segundo ponto");
        x2 = ler.nextDouble();
        System.out.println("Digite o Y do segundo ponto");
        y2 = ler.nextDouble();
        
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("A distancia entre os dois pontos eh " + distancia);
                
        
  
        
        
        
    }
    
    
    //public void CalculaDistancia(){
        
        
        
    
    
}
