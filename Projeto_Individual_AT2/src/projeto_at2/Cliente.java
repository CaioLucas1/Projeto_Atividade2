package projeto_at2;

import java.util.Random;

public class Cliente extends Thread {
	private Conta conta;
    private Loja[] lojas;

    // Inicialização dos atributos do 'Cliente' quando ele é criado.
    public Cliente(Conta conta, Loja[] lojas) {
        this.conta = conta;
        this.lojas = lojas;
    }

    public void run() {  // Lógica para realizar compras e alternar entre lojas.
        Random random = new Random();

        while (conta.getSaldo() > 0) {
            int lojaIndex = random.nextInt(lojas.length);
            double valorCompra = random.nextBoolean() ? 100.0 : 200.0;

            synchronized (conta) {
                if (conta.getSaldo() >= valorCompra) {
                    conta.debitar(valorCompra);
                    lojas[lojaIndex].receberPagamento(valorCompra);
                    System.out.println("Cliente realizou uma compra de R$ " + valorCompra);
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
}
