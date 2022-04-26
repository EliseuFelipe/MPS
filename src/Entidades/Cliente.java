package Entidades;

public class Cliente {
    
    private String nome;
    private String endereco;
    private String sexo;
    private String login;
    private String senha;

    public Cliente(){}

    public Cliente(String nome, String endereco, String sexo, String login, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
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

    

}