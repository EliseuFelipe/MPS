package Sistemas;

import java.util.List;

import Models.DTO.Admin;
import Models.DTO.Entregador;
import Models.Entidades.Funcionario;
import Repositorios.BancoDeDados;

public class Gerencia {
    BancoDeDados bancoDeDados = new BancoDeDados();

    public Funcionario criarFuncionario(String nome, String endereco, String sexo, String login, String senha, Long rg, int tipoFuncionario){
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

    public Funcionario alterarFuncionario(String nome, String endereco, String sexo, String login, String senha, Long rg, int tipoFuncionario) {
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

    public void removerFuncionario(Long rg){
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

    
}
