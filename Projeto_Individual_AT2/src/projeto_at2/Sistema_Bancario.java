package projeto_at2;

public class Sistema_Bancario {
	public static void main(String[] args) {
        Banco banco = new Banco();
        Conta contaBanco = new Conta(0);

        Loja loja1 = new Loja(new Conta(0));
        Loja loja2 = new Loja(new Conta(0));
        
        // Inicialização com a instância da 'Conta' e um salário de R$1.400,00
        Funcionario func01 = new Funcionario(new Conta(0), new Conta(0), 1400.0, banco);
        Funcionario func02 = new Funcionario(new Conta(0), new Conta(0), 1400.0, banco);
        Funcionario func03 = new Funcionario(new Conta(0), new Conta(0), 1400.0, banco);
        Funcionario func04 = new Funcionario(new Conta(0), new Conta(0), 1400.0, banco);
        
        // Inicialização com a instância da 'Conta' com saldo inicial de R$1.000,00
        Cliente client1 = new Cliente(new Conta(1000), new Loja[]{loja1, loja2});
        Cliente client2 = new Cliente(new Conta(1000), new Loja[]{loja1, loja2});
        Cliente client3 = new Cliente(new Conta(1000), new Loja[]{loja1, loja2});
        Cliente client4 = new Cliente(new Conta(1000), new Loja[]{loja1, loja2});
        Cliente client5 = new Cliente(new Conta(1000), new Loja[]{loja1, loja2});
        
        // Inicialização das threads para cada entidade (cliente e funcionário).
        Thread thrd1 = new Thread(client1);
        Thread thrd2 = new Thread(client2);
        Thread thrd3 = new Thread(client3);
        Thread thrd4 = new Thread(client4);
        Thread thrd5 = new Thread(client5);
        Thread thrd6 = new Thread(func01);
        Thread thrd7 = new Thread(func02);
        Thread thrd8 = new Thread(func03);
        Thread thrd9 = new Thread(func04);

        thrd1.start();
        thrd2.start();
        thrd3.start();
        thrd4.start();
        thrd5.start();
        thrd6.start();
        thrd7.start();
        thrd8.start();
        thrd9.start();

        // Aguardar a finalização de todas as threads.
        try {
            thrd1.join();
            thrd2.join();
            thrd3.join();
            thrd4.join();
            thrd5.join();
            thrd6.join();
            thrd7.join();
            thrd8.join();
            thrd9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exibição dos saldos finais das contas.
        System.out.println("==================================================");
        System.out.println("Saldos finais das contas apresentadas a seguir... ");
        System.out.println("Saldo final da conta do banco: R$ " + contaBanco.getSaldo());
        System.out.println("Saldo final da conta da loja 1: R$ " + loja1.getConta().getSaldo());
        System.out.println("Saldo final da conta da loja 2: R$ " + loja2.getConta().getSaldo());
        // Exibição dos saldos finais das contas (clientes e funcionários).
    }

}
