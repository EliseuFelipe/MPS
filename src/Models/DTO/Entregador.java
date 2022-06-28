package Models.DTO;

import Models.Entidades.Funcionario;

public class Entregador extends Funcionario{
    public static int tipoFuncionario = 0;

    public Entregador(String nome, String endereco, String sexo, String login, String senha, int rg){
        super(nome, endereco, sexo, login, senha, tipoFuncionario, rg);
    }
    
}
