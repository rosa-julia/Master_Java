
package cap4_ex1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class NewClass {
    double comp1, comp2, comp3, compri;
    boolean realizavel;
    
    public boolean VerificaTriangulo () { //como vai ser verificado o true ou false
        //se trata de um public >boolean<
    
        JOptionPane.showMessageDialog(null, "Digite o comprimento de 3 pedacos de madeira:");
        comp1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do 1º lado: "));
        comp2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do 2º lado: "));
        comp3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do 3º lado: "));
        
        
        if(comp1 <= comp2+comp3 || comp2 <= comp1+comp3 ||comp3 <= comp2+comp1) {
            JOptionPane.showMessageDialog(null,"Caso positivo 0\n");
            
        }   else{
            JOptionPane.showMessageDialog(null,"Caso negativo 1\n");
            realizavel = false;
            
        } realizavel = true;
        
    return realizavel; //não é void pois retorna o realizavel ao final
    } 
    
    public void VerificaTipo () {
        if (comp1 == comp2 && comp2 == comp3){
            JOptionPane.showMessageDialog(null,"Pode ser formado um triangulo equilatero");
            
        } else if (comp1 == comp2 ) { 
            JOptionPane.showMessageDialog(null,"Pode ser formado um triangulo isosceles");
            
        } else {
            JOptionPane.showMessageDialog(null,"Pode ser formado um triangulo escaleno");
            
        }
    }
    
    
    
    }


