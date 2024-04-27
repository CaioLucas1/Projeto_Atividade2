package projeto_at2;

public class Loja {
	private Conta conta;

    public Loja(Conta conta) {
        this.conta = conta;
    }
    // Recebimento do pagamento (loja).
    public void receberPagamento(double valor) {
        synchronized (conta) {
            conta.creditar(valor);
            System.out.println("Loja recebeu um pagamento de R$ " + valor);
        }
    }

    public Conta getConta() {
        return conta;
    }
    // Pagamento de funcionários.
    public synchronized void pagarFuncionario(double salario) {
        if (conta.getSaldo() >= salario) {
            conta.debitar(salario);
            System.out.println("Funcionário pago com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para pagar o funcionário.");
        }
        // Deduz o valor do salário da conta da loja.
    }

}
