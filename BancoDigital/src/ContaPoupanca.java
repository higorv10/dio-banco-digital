public class ContaPoupanca extends Conta implements ContaPoupancaInterface {
    private double juros;

    public ContaPoupanca(int numero, double saldo, double juros) {
        super(numero, saldo);
        this.juros = juros;
    }

    @Override
    public void calcularJuros() {
        this.depositar(this.getSaldo() * this.juros);
        if (this.getSaldo() < 0) {
            System.out.println("Não é possível calcular juros em contas com saldo negativo.");
            return;
        }
    }
}
