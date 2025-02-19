
public abstract class Conta implements ContaInterface {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public int getNumero() {
        return this.numero;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void transferir(ContaInterface destino, double valor) {
        this.saldo -= valor;
        destino.depositar(valor);
    }

}