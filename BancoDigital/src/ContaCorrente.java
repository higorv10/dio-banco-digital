
public class ContaCorrente extends Conta implements ContaCorrenteInterface {
    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public void sacarComLimite(double valor) {
        if (this.getSaldo() + this.limite < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque com limite.");

        } else {
            this.sacar(valor);
            System.out.println("Saque com limite realizado com sucesso.");
        }

    }
}