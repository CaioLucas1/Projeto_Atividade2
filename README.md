# Projeto Sistema Bancário: <br> Envolvendo Threads em Java
Este projeto foi criado na disciplina: Programação Concorrente e Distribuída com a representação 
<br>da utilização de threads e demais conceitos vistos na própria disciplina.
Ele consiste na implementação <br> de um sistema bancário em Java 17.
<br>O sistema é composto pelas seguintes entidades:
* Banco;
* Loja;
* Funcionário;
* Cliente;
* Conta.

# Entidades e Funcionalidades
<b>Cliente</b>
<br>Cada cliente é simbolizado por uma thread e possui uma conta bancária com um 
<br>saldo inicial de R$ 1.000,00. O cliente efetua compras alternadamente entre as duas lojas 
<br>disponíveis, gastando R$ 100,00 ou R$ 200,00 até que o saldo da conta seja esgotado.

<br><b>Loja</b>
<br>Cada loja detém uma conta bancária destinada a receber os pagamentos efetuados
<br>pelos clientes. Adicionalmente, a loja efetua o pagamento dos funcionários quando 
<br>dispõe do montante requerido, o qual é de R$ 1.400,00 para cada funcionário.

<br><b>Funcionário</b>
<br>Cada funcionário é simbolizado por uma thread e dispõe de duas contas bancárias:
<br>Uma para receber o pagamento da loja e outra destinada a investimentos. Após o 
<br>recebimento do salário, o funcionário aloca 20% do montante na conta de investimentos.

<br><b>Banco</b>
<br>O banco coordena as transações de maneira síncrona e organizada, assegurando a integridade
<br>dos saldos das contas. Além disso, ele apresenta o montante transferido e o saldo final de cada
<br>conta após a execução, garantindo a consistência dos saldos independentemente da sequência
<br>das operações.

# Detalhes de implementação
* Linguagem: Java;
* Utilização de Threads para representar entidades e realizar transações;
* Garantia de consistência dos saldos pelo Banco;
* Exibição dos valores das transferências e saldos finais.

# Autor(es)
Este projeto foi desenvolvido por [CaioLucas1].
