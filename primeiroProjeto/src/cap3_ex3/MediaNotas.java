
package cap3_ex3;

import java.util.Scanner;


public class MediaNotas {
    
    public void MediaArit(){
        String nome;
        int nota1, nota2, nota3, nota4 = 0;
        float media, mediaFinal, exameFinal = 0;
      
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        nome = scan.nextLine();
        System.out.println("Digite as quatro notas do aluno: ");
        nota1 = scan.nextInt();
        nota2 = scan.nextInt();
        nota3 = scan.nextInt();
        nota4 = scan.nextInt();
        
        media = (nota1+nota2+nota3+nota4)/4 ;
        
        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else if (media <6){
            System.out.println("Media: " + media + " Digite a nota do exame final: ");
            
            exameFinal = scan.nextFloat();
            mediaFinal = (media+exameFinal)/2;
           
           if (mediaFinal >= 5) {
               System.out.println("Aprovado na recuperacao");
           } else System.out.println("Reprovado na recuperacao");
            
        }
        
    }
    
            
}
