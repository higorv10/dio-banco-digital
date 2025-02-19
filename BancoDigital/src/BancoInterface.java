import java.util.List;

public interface BancoInterface {

    void criarConta(ContaInterface conta);

    ContaInterface getConta(int numero);

    List<ContaInterface> getContas();

    void fecharConta(ContaInterface conta);

    void adicionarCliente(ClienteInterface clientes);

    void removerCliente(ClienteInterface clientes);

    List<ClienteInterface> getClientes();
}