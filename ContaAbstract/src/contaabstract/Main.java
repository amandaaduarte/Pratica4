package contaabstract;

public class Main {
    public void main(String[] args){
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();

    }

}
