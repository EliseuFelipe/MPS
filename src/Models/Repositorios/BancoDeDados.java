package Repositorios;

public class BancoDeDados {
    
    private RepositorioFuncionario listaFuncionario;
    private RepositorioProduto listaProduto;
    private RepositorioCliente listaCliente;

    public BancoDeDados(){}

    public RepositorioFuncionario getListaFuncionarios(){
        if(listaFuncionario != null){
            return listaFuncionario;
        } else {
            listaFuncionario = new RepositorioFuncionario();
        }
        return listaFuncionario;
    }
    public RepositorioProduto getListaProdutos(){
        if(listaProduto != null){
            return listaProduto;
        } else {
            listaProduto = new RepositorioProduto();
        }
        return listaProduto;
    }
    public RepositorioCliente getListaClientes(){
        if(listaFuncionario != null){
            return listaCliente;
        } else {
            listaCliente = new RepositorioCliente();
        }
        return listaCliente;
    }
}
