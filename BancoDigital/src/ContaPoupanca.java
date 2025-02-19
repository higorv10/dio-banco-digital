public class ContaPoupanca extends Conta implements ContaPoupancaInterface {
    private double juros;

    public ContaPoupanca(int numero, double saldo, double juros) {
        super(numero, saldo);
        this.juros = juros;
    }

    @Override
    public void calcularJuros() {
        if (this.getSaldo() < 0) {
            throw new IllegalArgumentException("Saldo da conta é inválido para calcular juros.");
        } else
            this.depositar(this.getSaldo() * this.juros);
    }
}