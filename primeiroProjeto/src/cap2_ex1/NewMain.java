/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap2_ex1;

import java.util.Scanner;

/**
 *
 * @author Prog
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               String nomeCarro;
       int velocidadeCarro;
       float tempoAceleracao;
       double precoCarro;
       
       Scanner objscanner = new Scanner (System.in);
       
        System.out.println("Nome do Carro: ");
        nomeCarro = objscanner.nextLine();
        System.out.println("Velocidade Máxima: ");
        velocidadeCarro = objscanner.nextInt();
        System.out.println("Tempo de Aceleração: ");
        tempoAceleracao = objscanner.nextFloat();
        System.out.println("Preço: ");
        precoCarro = objscanner.nextDouble();
    }
    
}
