package cap2_ex1;
import java.util.Scanner;

public class DeclaracaoVar {

    public static void main(String[] args){
       String nomeCarro;
       int velocidadeCarro;
       float tempoAceleracao;
       double precoCarro;
       
       Scanner objscanner = new Scanner (System.in);
       
        System.out.println("Nome do Carro: ");
        nomeCarro = objscanner.nextLine();
        System.out.println("Velocidade Maxima: ");
        velocidadeCarro = objscanner.nextInt();
        System.out.println("Tempo de Aceleracao: ");
        tempoAceleracao = objscanner.nextFloat();
        System.out.println("Preço: ");
        precoCarro = objscanner.nextDouble();
        System.out.println("O nome eh:  "+ nomeCarro+ "");
//       
    }   
}
