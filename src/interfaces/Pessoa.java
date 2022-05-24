package interfaces;

import Sistemas.Data;
import java.lang.Comparable;

public interface Pessoa {
	
    public void entrada(String nome, String endereco, String sexo, String login, 
    		String senha, String data_nascimento);
}