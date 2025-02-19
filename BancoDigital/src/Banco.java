import java.util.ArrayList;
import java.util.List;

public class Banco implements BancoInterface {
    private List<ContaInterface> conta;
    private List<ClienteInterface> cliente;

    public Banco() {
        this.conta = new ArrayList<>();
        this.cliente = new ArrayList<>();
    }

    @Override
    public void adicionarCliente(ClienteInterface cliente) {
        this.cliente.add(cliente);
    }

    @Override
    public void removerCliente(ClienteInterface cliente) {
        this.cliente.remove(cliente);
    }

    @Override
    public List<ClienteInterface> getClientes() {
        return this.cliente;
    }

    @Override
    public void criarConta(ContaInterface conta) {
        this.conta.add(conta);
    }

    @Override
    public void fecharConta(ContaInterface conta) {
        this.conta.remove(conta);
    }

    @Override
    public ContaInterface getConta(int numero) {
        for (ContaInterface conta : this.conta) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public List<ContaInterface> getContas() {
        return this.conta;
    }
}
