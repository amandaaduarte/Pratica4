package contaabstract;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
    public void imprimeExtrato(){
        System.out.println("### Extrato de conta ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:MM:SS");
          Date date = new Date();

          System.out.println("Saldo: " + this.getSaldo());
          System.out.println("Data: " + sdf.format(date));
    }

}
