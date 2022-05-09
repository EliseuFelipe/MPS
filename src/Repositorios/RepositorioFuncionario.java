package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Entidades.Funcionario;

public class RepositorioFuncionario {
    
    private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    public RepositorioFuncionario(){}
    
    public void adicionarFuncionario(Funcionario funcionario){
    	listaFuncionario.add(funcionario);
    }
}