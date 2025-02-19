import java.util.ArrayList;
import java.util.List;

public class Cliente implements ClienteInterface {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private List<ContaInterface> conta;

    public Cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.conta = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public List<ContaInterface> getContas() {
        return this.conta;
    }

    @Override
    public void adicionarConta(ContaInterface conta) {
        this.conta.add(conta);

    }

    @Override
    public void removerConta(ContaInterface conta) {
        this.conta.remove(conta);

    }
}
