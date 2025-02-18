public class Main {
    public static void main(String[] args) {
        BancoInterface banco = new Banco();

        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 1500, 0.05);

        banco.criarConta(contaCorrente);
        banco.criarConta(contaPoupanca);

        System.out.println("Saldo inical da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo inicial da Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.depositar(500);
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

    }
}