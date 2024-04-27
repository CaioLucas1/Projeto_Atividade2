package projeto_at2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {
	private Lock lock = new ReentrantLock();
	
    // Transferir um determinado valor de uma conta de origem para destino.
    public void transferir(Conta origem, Conta destino, double valor) {
        lock.lock();
        try {
            if (origem.getSaldo() >= valor) {
                origem.debitar(valor);
                destino.creditar(valor);
                System.out.println("Transferência de R$ " + valor + " realizada.");
            } else {
                System.out.println("Saldo insuficiente para transferência de R$ " + valor);
            }
        } finally {
            lock.unlock();
        }
    }

}
