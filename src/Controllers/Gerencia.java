package Controllers;

import java.util.List;

import Models.DTO.Admin;
import Models.DTO.Entregador;
import Models.Entidades.Funcionario;
import Models.Entidades.Produto;
import Models.Repositorios.BancoDeDados;

public class Gerencia {
    BancoDeDados bancoDeDados = new BancoDeDados();

    public Funcionario criarFuncionario(String nome, String endereco, String sexo, String login, String senha, int rg, int tipoFuncionario){
        if(tipoFuncionario == 0){
            Entregador entregador = new Entregador(nome, endereco, sexo, login, senha, rg);
            bancoDeDados.getListaFuncionarios().adicionarFuncionario(entregador);
            return entregador;
        } else if(tipoFuncionario == 1){
            Admin admin = new Admin(nome, endereco, sexo, login, senha, rg);
            bancoDeDados.getListaFuncionarios().adicionarFuncionario(admin);
            return admin;
        } else {
            return null;
        }
    }

    public Funcionario alterarFuncionario(String nome, String endereco, String sexo, String login, String senha, int rg, int tipoFuncionario) {
        Funcionario funcionario = bancoDeDados.getListaFuncionarios().listarFuncionario(rg);

        if(funcionario != null){
            funcionario.setNome(nome);
            funcionario.setEndereco(endereco);
            funcionario.setSexo(sexo);
            funcionario.setLogin(login);
            funcionario.setSenha(senha);
            funcionario.setTipoFuncionario(tipoFuncionario);
            
            bancoDeDados.getListaFuncionarios().adicionarFuncionario(funcionario);
            
            return funcionario;
        } else {
            return null;
         }
    }

    public void removerFuncionario(int rg){
        Funcionario funcionario = bancoDeDados.getListaFuncionarios().listarFuncionario(rg);

        if(funcionario != null){
            bancoDeDados.getListaFuncionarios().removerFuncionario(rg);
        }
    }

    public void listarTodosFuncionarios(){
        List<Funcionario> repositorioFuncionario = bancoDeDados.getListaFuncionarios().listarTodosFuncionarios();
        for (Funcionario funcionario : repositorioFuncionario) {
          System.out.println("######## LISTA DE  FUNCIONARIOS ########\n"+
            "Nome: " + funcionario.getNome() +
            "Endereco: " + funcionario.getEndereco() + 
            "Sexo: " + funcionario.getSexo() + 
            "RG: " + funcionario.getRG() +
            "Tipo de Funcionario: " + funcionario.getTipoFuncionario());           
        }
    }

    public Produto criarProduto(String nome, Float valor, String descricao, String imagem, String codigo){
        Produto produto = bancoDeDados.getListaProdutos().listarProduto(codigo);
        if(produto == null){
            Produto entregador = new Produto(nome, valor, descricao, imagem, codigo);
            bancoDeDados.getListaProdutos().adicionarProduto(produto);
            return entregador;
        } else {
            return null;
        }
    }

    public Produto alterarProduto(String nome, Float valor, String descricao, String imagem, String codigo) {
        Produto produto = bancoDeDados.getListaProdutos().listarProduto(codigo);
        if(produto != null){
            produto.setNome(nome);
            produto.setCodigo(codigo);
            produto.setDescricao(descricao);
            produto.setImagem(imagem);
            produto.setValor(valor);

            bancoDeDados.getListaProdutos().adicionarProduto(produto);
            
            return produto;
        } else {
            return null;
         }
    }

    public void removerProduto(String codigo){
        Produto produto = bancoDeDados.getListaProdutos().listarProduto(codigo);

        if(produto != null){
            bancoDeDados.getListaProdutos().removerProduto(codigo);
            System.out.print("Produto: " + codigo + " removido com sucesso!\n");
        }
        else {
            
            System.out.print("Impossivel remover o Produto: " + codigo + "\n");
        }
    }

    public void listarTodosProduto(){
        List<Produto> repositorioProduto = bancoDeDados.getListaProdutos().listarProdutos();
        for (Produto produto : repositorioProduto) {
          System.out.println("######## LISTA DE  FUNCIONARIOS ########\n"+
            "Nome: " + produto.getNome() +
            "Valor: " + produto.getValor() + 
            "Descrição: " + produto.getDescricao() + 
            "Imagem: " + produto.getImagem() +
            "Codigo: " + produto.getCodigo() + "\n");           
        }
    }
    
}
