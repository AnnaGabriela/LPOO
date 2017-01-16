package interfaces;

import entidades.Status;
import excecoes.IdException;
import excecoes.SenhaException;
import java.util.ArrayList;

public interface RepGenInterface <T> {
    
    public void adicionar(T generico);

    public void adicionarFixo(T generico) throws IdException, SenhaException;
   
    public String remover(long id);

    public String toString();

    public void alterarSenha(long id, String novaSenha) throws IdException, SenhaException;

    public void alterarNome(long id, String novoNome) throws IdException, SenhaException;

    public void logout(String login, String senha);

    public long buscarPeloLogin(String login, long idRest);
    
    public long buscar(long idRest);

    public boolean contains();
    
    public boolean verificar(String login, String senha);

    public void verificarStatus(Status statusPedido);
    
    public void listar();
    
    public String listarCardapio(long id);

    public ArrayList <T> getCopia ();
    
    public ArrayList<T> getG();

    public void setG(ArrayList<T> g);

    public long getQtd();

    public void setQtd(long qtd);

    public long getProximoID();

    public void setProximoID(long proximoID);

}