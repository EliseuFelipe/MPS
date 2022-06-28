package Views;

import java.util.ArrayList;
import java.util.List;

import Controllers.Gerencia;
import Models.DTO.Admin;
import Models.DTO.Entregador;
import Models.Entidades.Funcionario;
import Models.Repositorios.BancoDeDados;

public class Tela {
    
    private static Gerencia gerencia = new Gerencia();

    public static void main(String[] args){
        
        Funcionario admin = gerencia.criarFuncionario("Leandro Almeida Trindade", "Rua eduardo silva, 325, numero 57", "Masculino", "leandroAT", "123455", 598928416, 1);
        Funcionario entregador = gerencia.criarFuncionario("Fernando Migual Loureiro", "Av. Presidente Vargas, numero 223, 90", "Masculino", "fermilo", "23123", 98512648, 2);

        System.out.println("Seja Bem Vindo, ao PapperFly!");
        System.out.println("Realize o seu login");
        
        
    
    }
}
