
public interface ContaInterface {

    int getNumero();

    double getSaldo();

    void depositar(double valor);

    void sacar(double valor);

    void transferir(ContaInterface destino, double valor);

}
