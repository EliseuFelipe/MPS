package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Entidades.Funcionario;
import Entidades.Produto;

public class RepositorioFuncionario {
    
    private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    public RepositorioFuncionario(){}
    
    public void adicionarFuncionario(Funcionario funcionario){
    	listaFuncionario.add(funcionario);
    }

    public void adicionarFuncionario(String nome, String endereco, String sexo, String login,
    String senha, List<Produto> listaDeCompras, int tipoFuncionario){

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setEndereco(endereco);
        funcionario.setSexo(sexo);
        funcionario.setLogin(login);
        funcionario.setSenha(senha);
        funcionario.setTipoFuncionario(tipoFuncionario);

        listaFuncionario.add(funcionario);
    }

    public List<Funcionario> listarTodosFuncionarios(){
        return listaFuncionario;
    }

    public Funcionario listarFuncionario(Long rg) {
        Funcionario funcionario = null;

        for (Funcionario func : listaFuncionario) {
            if(func.getRG().equals(rg)){
                funcionario = func;
                break;
            }
        }

        return funcionario;
    }

    public Funcionario editarFuncionario(Funcionario funcionario){
        Funcionario editFuncionario = listarFuncionario(funcionario.getRG());
        int index = listaFuncionario.indexOf(funcionario);

        if(editFuncionario != null){
            editFuncionario.setEndereco(funcionario.getEndereco());   
            editFuncionario.setNome(funcionario.getNome());
            editFuncionario.setLogin(funcionario.getLogin());
            editFuncionario.setSenha(funcionario.getSenha());
            editFuncionario.setListaDeCompras(funcionario.getListaDeCompras());
            editFuncionario.setRG(funcionario.getRG());
            editFuncionario.setTipoFuncionario(funcionario.getTipoFuncionario());
            editFuncionario.setSexo(funcionario.getSexo());
            
            listaFuncionario.set(index, editFuncionario);

            return editFuncionario;
        } else {
            return null;
        }
    }

    public void removerFuncionario(Long rg){
        Funcionario funcionario = listarFuncionario(rg);

        if(funcionario != null){
            listaFuncionario.remove(funcionario);
        }
    }
}