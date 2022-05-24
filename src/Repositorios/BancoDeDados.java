package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.Cliente;
import Entidades.ClientePJ;
import Entidades.Funcionario;
import Entidades.Produto;

public class BancoDeDados {
    
    private List<Funcionario> listaFuncionario;
    private List<Produto> listaProduto;
    private List<Cliente> listaCliente;

    public BancoDeDados(){}

    public List<Funcionario> getListaFuncionarios(){
        if(listaFuncionario != null){
            return listaFuncionario;
        } else {
            listaFuncionario = new ArrayList<>();
        }
        return listaFuncionario;
    }
    public List<Produto> getListaProdutos(){
        if(listaProduto != null){
            return listaProduto;
        } else {
            listaProduto = new ArrayList<>();
        }
        return listaProduto;
    }
    public List<Cliente> getListaClientes(){
        if(listaFuncionario != null){
            return listaCliente;
        } else {
            listaCliente = new ArrayList<>();
        }
        return listaCliente;
    }
}
