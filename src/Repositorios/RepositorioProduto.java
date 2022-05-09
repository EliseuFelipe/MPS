package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.Produto;

public class RepositorioProduto {
 
    private List<Produto> listaProduto = new ArrayList<Produto>();

    public RepositorioProduto(){}
    
    public void adicionarProduto(Produto produto){
    	listaProduto.add(produto);
    }
}