
package Heranca;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor ();
        v.setNome("M�rio");
        v.setSalario(1000.0f);
        v.setCpf("205112020");
        v.setDataDeNascimento(new Date());
        v.setTotalItensVendiso (10);
        
        System.out.println("O sal�rio do vendedor �: " + v.calcularSalario())
        
        Motorista m = new Motorista ();
        
        v.calcularSalario()
    }
}
