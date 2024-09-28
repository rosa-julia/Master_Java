
package cap6_ex2;


public class Numero {
    int soma;
    
    public boolean perfeito(int num){
        
         for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
                
            }
                if (soma == num) {
                System.out.println("Numero perfeito " + num );
                }
            } 
         
            
        return true;
        
    }
         
    
}

    

    
