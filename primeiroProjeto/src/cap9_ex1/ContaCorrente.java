
package cap9_ex1;


public class ContaCorrente extends Conta {
    
    public void atualiza(){
        System.out.println("Digite a taxa a ser aplicada no saldo:");
        taxa = ler.nextDouble();
        saldo = saldo*(1+(taxa*2));
    }
    
    public double deposita(){
        System.out.println("Quanto voce deseja depositar na conta?");
        double deposito = ler.nextDouble();
        saldo = saldo + deposito - 0.10;
        return saldo;
    }
}
