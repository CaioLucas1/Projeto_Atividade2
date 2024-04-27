package projeto_at2;

public class Conta {
	private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    // O método 'getSaldo()' é sincronizado para garantir a consistência em acessar o saldo.
    public synchronized double getSaldo() {
        return saldo;
    }
    
    // Os métodos 'debitar()' e 'creditar()' são sincronizados para proteger 
    // as operações em um ambiente de thread.
    public synchronized void debitar(double valor) {
        saldo -= valor;
    }

    public synchronized void creditar(double valor) {
        saldo += valor;
    }

}
