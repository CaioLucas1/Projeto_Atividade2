package projeto_at2;

public class Funcionario extends Thread {
	private Conta contaSalario;
    private Conta contaInvestimento;
    private double salario;

    // Inicialização dos atributos do 'Funcionario' quando ele é criado.
    public Funcionario(Conta contaSalario, Conta contaInvestimento, double salario, Banco banco) {
        this.contaSalario = contaSalario;
        this.contaInvestimento = contaInvestimento;
        this.salario = salario;
    }

    public void run() {  // Lógica para receber salário e investir 20%.
        synchronized (contaSalario){
            double valorRecebido = salario;
            contaSalario.creditar(valorRecebido);
            
            System.out.println("Salário recebido: R$ " + valorRecebido);

            double valorInvestido = valorRecebido * 0.2;
            contaSalario.debitar(valorInvestido);
            contaInvestimento.creditar(valorInvestido);

            System.out.println("Valor investido na conta de investimentos: R$ " + valorInvestido);
        }
        
    }

}
