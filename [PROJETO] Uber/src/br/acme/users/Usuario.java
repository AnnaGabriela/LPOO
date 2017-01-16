package br.acme.users;

public class Usuario {

    private long id;
    private String cpf;
    private String nome;
    private String senha;
    private String email;
    private String sexo;

    public Usuario(long id, String cpf, String nome, String senha, String email, String sexo) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        String dados = "ID: " + this.getId() + ";"
                + "CPF: " + this.getCpf() + ";"
                + "Nome: " + this.getNome() + ";"
                + "Senha:" + this.getSenha() + ";"
                + "Email: " + this.getEmail() + ";"
                + "Sexo: " + this.getSexo();
        return dados;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
