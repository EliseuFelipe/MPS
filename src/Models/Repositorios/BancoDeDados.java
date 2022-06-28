package Models.Repositorios;

public class BancoDeDados {
    
    private RepositorioFuncionario listaFuncionario;
    private RepositorioProduto listaProduto;

    public BancoDeDados(){
        this.listaFuncionario = new RepositorioFuncionario();
        this.listaProduto = new RepositorioProduto();
    }

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

}
