package cap9_ex1;

import java.util.Scanner;


public class Conta {
    protected double saldo, taxa;
    
    Scanner ler = new Scanner(System.in);
    
    public double deposita(){
        System.out.println("Quanto voce deseja depositar na conta?");
        double deposito = ler.nextDouble();
        saldo = saldo + deposito;
        return saldo;
    }
    
    public double saca(){
        System.out.println("Quanto voce deseja sacar da conta?");
        double saque = ler.nextDouble();
        saldo = saldo - saque;
        return saldo;
    }

    public double getSaldo() {
        System.out.println("Saldo atual R$: " +saldo);
        return saldo;
    }
    
    
    public void atualiza(){
        System.out.println("Digite a taxa a ser aplicada no saldo:");
        taxa = ler.nextDouble();
        saldo = saldo*(1+taxa);
    
    }
}
