
package cap5_ex1;

import java.util.Scanner;


public class JogoAdivinhacao {
    
    private int tentativa, numeroEscolhido;
    
    public void adivinharNumero(){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um número de 1 a 100");
        setNumeroEscolhido(ler.nextInt());
        
        for (int i=0; i<5;i++){
            
            System.out.println("Tente adivinhar o numero");
            setTentativa(ler.nextInt());
            
            if (getNumeroEscolhido() == getTentativa()){
                System.out.println("Parabéns, voce acertou!!");
                System.exit(0);
                
            } else if (getNumeroEscolhido() > getTentativa()){
                System.out.println("Tente um numero maior");
            } else {
                System.out.println("Tente um numero menor");
            }
            
        }
        ler.close();
        System.out.println("Você perdeu :( ");
           
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    public int getNumeroEscolhido() {
        return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }
    
}
