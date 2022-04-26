package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    
    private String nome;
    private String endereco;
    private String sexo;
    private String login;
    private String senha;
    private List<Produto> listaDeCompras = new ArrayList<>();
    private int tipoFuncionario;

    public Funcionario(String nome, String endereco, String sexo, String login, String senha,
            List<Produto> listaDeCompras, int tipoFuncionario) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
        this.listaDeCompras = listaDeCompras;
        this.tipoFuncionario = tipoFuncionario;
    }
    public List<Produto> getListaDeCompras() {
        return listaDeCompras;
    }
    public void setListaDeCompras(List<Produto> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }
    public int getTipoFuncionario() {
        return tipoFuncionario;
    }
    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
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