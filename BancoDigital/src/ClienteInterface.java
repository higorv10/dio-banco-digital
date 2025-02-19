import java.util.List;

public interface ClienteInterface {

    String getNome();

    String getEndereco();

    String getTelefone();

    String getEmail();

    List<ContaInterface> getContas();

    void adicionarConta(ContaInterface conta);

    void removerConta(ContaInterface conta);

}