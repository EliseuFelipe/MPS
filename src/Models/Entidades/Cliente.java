package Models.Entidades;

import Sistemas.Data;
import java.lang.Comparable;

public class Cliente implements Comparable<Cliente> {
    
    private String nome;
    private String endereco;
    private String sexo;
    private String login;
    private String senha;
    private Data data_nascimento;

    public Cliente(){}

    public Cliente(String nome, String endereco, String sexo, String login, String senha, String data_nascimento) {
        super();
    	this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
        this.data_nascimento.DefinirData(data_nascimento);
    }
    
    @Override
	public int compareTo(Cliente c) {
		return nome.compareToIgnoreCase(c.getNome());
	}
    
	public int compareTo(Cliente c, Data d) {
		return nome.compareToIgnoreCase(c.getNome());
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
    public Data getdata_nascimento(){
    	return data_nascimento;
    }
    public void setdata_nascimento(String data_nascimento){
    	this.data_nascimento.DefinirData(data_nascimento);
    }
    public void setdata_nascimento(int dia, int mes, int ano){
    	this.data_nascimento.DefinirData(dia, mes, ano);
    }
    
}