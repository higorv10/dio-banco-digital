public class Main {
    public static void main(String[] args) {
        BancoInterface banco = new Banco();

        ClienteInterface cliente1 = new Cliente("Zelda", "Hyrule", "12345678", "zelda@gmail.com");

        banco.adicionarCliente(cliente1);

        ContaCorrenteInterface contaCorrente = new ContaCorrente(1, 1000, 500);
        ContaPoupancaInterface contaPoupanca = new ContaPoupanca(2, 1500, 0.05);

        banco.criarConta(contaCorrente);
        banco.criarConta(contaPoupanca);

        cliente1.adicionarConta(contaCorrente);
        cliente1.adicionarConta(contaPoupanca);

        System.out.println("Saldo inical da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo inicial da Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.depositar(1800);
        contaPoupanca.depositar(200);

        System.out.println("Saldo após deposito na Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo após deposito na Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(300);
        contaPoupanca.sacar(100);

        System.out.println("Saldo após saque na Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo após saque na Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.transferir(contaPoupanca, 300);

        System.out.println("Saldo após transferência da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo após transferência da Conta Poupanca: " + contaPoupanca.getSaldo());

        contaPoupanca.calcularJuros();

        System.out.println("Saldo após cálculo de juros na Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.sacarComLimite(1600);

        System.out.println("Saldo após saque com limite na Conta Corrente: " + contaCorrente.getSaldo());

        System.out.println("Contas de Zelda após operações:");
        for (ContaInterface conta : cliente1.getContas()) {
            System.out.println("Conta " + conta.getNumero() + ": " + conta.getSaldo());
        }

    }
}