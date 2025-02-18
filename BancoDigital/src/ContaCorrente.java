
public class ContaCorrente extends Conta implements ContaCorrenteInterface {
    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public void sacarComLimite(double valor) {
        if (this.getSaldo() + this.limite >= valor) {
            this.sacar(valor);
            System.out.println("Saque com limite realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para sacar com limite.");
        }
    }
}