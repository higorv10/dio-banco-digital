import java.util.ArrayList;
import java.util.List;

public class Banco implements BancoInterface {
    private List<ContaInterface> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    @Override
    public void criarConta(ContaInterface conta) {
        this.contas.add(conta);
    }

    @Override
    public void fecharConta(ContaInterface conta) {
        if (conta != null && conta.getSaldo() == 0) {
            this.contas.remove(conta);
            System.out.println("Conta fechada com sucesso.");
        } else {
            System.out.println("Não é possível fechar a conta com saldo pendente.");
        }
    }

    @Override
    public ContaInterface getConta(int numero) {
        for (ContaInterface conta : this.contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public List<ContaInterface> getContas() {
        return this.contas;
    }
}
