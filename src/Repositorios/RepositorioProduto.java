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

    public Produto adicionarProduto(String nome, Float valor, String descricao, String imagem, String codigo) {
        Produto produto = new Produto(nome, valor, descricao, imagem, codigo);
        
        listaProduto.add(produto);

        return produto;
    }

    public List<Produto> listarProdutos(){
        return listaProduto;
    }

    public Produto listarProduto(String codigo) {
        Produto produto = null;

        for (Produto prod : listaProduto) {
            if(prod.getCodigo().equals(codigo)){
                produto = prod;
                break;
            }
        }

        return produto;
    }

    public Produto editarProduto(String nome, Float valor, String descricao, String imagem, String codigo){
        Produto produto = listarProduto(codigo);
        int index = listaProduto.indexOf(produto);


        if(produto != null) {
            produto.setCodigo(codigo);
            produto.setDescricao(descricao);
            produto.setImagem(imagem);
            produto.setNome(nome);
            produto.setValor(valor);

            listaProduto.set(index, produto);
            return produto;            
        } else {
            return null;
        }
    }

    public void removerProduto(String codigo) {
        Produto produto = listarProduto(codigo);

        if(produto != null){
            listaProduto.remove(produto);
        }
    }
}