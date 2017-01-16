package interfaces;

import entidades.Cliente;

public interface RepClienteInterface {

    void adicionarCliente(Cliente cliente);

    void adicionarClienteFixo(Cliente cliente);

    void removerCliente(int id);

    void listarClientes();

    void alterarSenha(int id, String novaSenha);

    void alterarNome(int id, String novoNome);

    boolean contains(Cliente cliente);

    boolean verificarCliente(String login, String senha);

    public Cliente clientePeloLogin(String login);

}
