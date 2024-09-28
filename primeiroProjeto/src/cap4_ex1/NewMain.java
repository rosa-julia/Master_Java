
package cap4_ex1;


public class NewMain {

    
    public static void main(String[] args) {
        NewClass comparar = new NewClass();
        Fatura.CalcularFatura();
        
       if (comparar.VerificaTriangulo() == true){
           comparar.VerificaTipo();
         }
        
       
        
    }
    
}
