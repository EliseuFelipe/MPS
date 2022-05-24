package Sistemas;

import DTO.Admin;
import DTO.Entregador;
import Entidades.Funcionario;
import Repositorios.BancoDeDados;

public class Gerencia {
    BancoDeDados bancoDeDados = new BancoDeDados();

    public Funcionario criarFuncionario(String nome, String endereco, String sexo, String login, String senha, Long rg, int tipoFuncionario){
        if(tipoFuncionario == 0){
            Entregador entregador = new Entregador(nome, endereco, sexo, login, senha, rg);
            bancoDeDados.getListaFuncionarios().add(entregador);
            return entregador;
        } else if(tipoFuncionario == 1){
            Admin admin = new Admin(nome, endereco, sexo, login, senha, rg);
            bancoDeDados.getListaFuncionarios().add(admin);
            return admin;
        } else {
            return null;
        }
    }
    
}
