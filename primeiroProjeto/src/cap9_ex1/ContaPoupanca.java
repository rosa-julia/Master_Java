
package cap9_ex1;


public class ContaPoupanca extends Conta {
    
    public void atualiza(){
        System.out.println("Digite a taxa a ser aplicada no saldo:");
        taxa = ler.nextDouble();
        saldo = saldo*(1+(taxa*3));
    
    }
}
