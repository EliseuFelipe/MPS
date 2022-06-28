package Models.DTO;

import Models.Entidades.Funcionario;

public class Admin extends Funcionario{
    public static int tipoFuncionario = 1;

    public Admin(String nome, String endereco, String sexo, String login, String senha, int rg){
        super(nome, endereco, sexo, login, senha, tipoFuncionario, rg);
    }
}
