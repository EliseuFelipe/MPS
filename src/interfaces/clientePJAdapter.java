package interfaces;

import Entidades.ClientePJ;

public class clientePJAdapter implements Pessoa{

	private ClientePJ c;
	
	public clientePJAdapter(ClientePJ c) {
		this.c=c;
	}
	
	@Override
	public void entrada(String nome, String endereco, String sexo, String login, 
    		String senha, String data_nascimento) {
		this.c.executar(nome, endereco, sexo, login, senha, data_nascimento);
	}
}
