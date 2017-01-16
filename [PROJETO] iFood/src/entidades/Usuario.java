package entidades;

import excecoes.IdException;
import excecoes.SenhaException;

public abstract class Usuario {
// ------------- ATRIBUTOS --------------

    public String login;
    public String senha;
    public String nome;
    public long id;
    
// ------------- CONSTRUTOR --------------
    public Usuario(String login, String senha, String nome, long id) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.id = id;
    }
    
// ------------- GET & SET --------------
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void validar () throws IdException, SenhaException {
    }
}
