public class ContaBancaria {
    public int numeroConta;
    public String nomeTitular;
    public double saldo;

  
    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo = valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }


    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("5600", "João", 500.0);

        minhaConta.depositar(500.0);
      
        minhaConta.sacar(200.0);
        minhaConta.sacar(2000.0); 
        
        System.out.println("Saldo final: R$" + minhaConta.getSaldo());
    }
}

