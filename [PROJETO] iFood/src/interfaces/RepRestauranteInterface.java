package interfaces;

import entidades.ItemCardapio;
import entidades.Restaurante;

public interface RepRestauranteInterface {
    
    void adicionarRestaurante(Restaurante restaurante);
    
    void adicionarRestauranteFixo(Restaurante restaurante);
    
    void removerRestaurante(int id);
    
    void listarRestaurantes();
    
    void alterarSenha(int id, String novaSenha);
    
    void alterarNome(int id, String novoNome);
    
    boolean contains(Restaurante restaurante);
    
    void logout(String login, String senha);
    
    boolean verificarRest(String login, String senha);
    
    Restaurante buscar(long idRest);
    
    void validar();

    public void adicionarPrato(int idRestaurante, ItemCardapio item);

    public void removerPrato(int idRestaurante, int idPrato);

    public long buscarPeloLogin(String login);
    
}
