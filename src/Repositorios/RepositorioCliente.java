package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.Cliente;

public class RepositorioCliente {
 
    private List<Cliente> listaCliente = new ArrayList<Cliente>();

    public RepositorioCliente(){}
    
    public boolean validaLogin(String login) {
    	if(login.length()<12 & login.length()>0) {
    		for(int i = 0; i<login.length(); i++) {
    			if((int)login.charAt(i) >=48 && (int)login.charAt(i)<=57) {
    				return false;
    			}
    		}
    		return true;
    	}
		return false;
    }
    
    public boolean validaSenha(String senha) {
    	boolean possuiLetra = false;
    	int numeros=0;
    	if(senha.length()<20 & senha.length()>8) {
    		for(int i = 0; i<senha.length(); i++) {
    			if((int)senha.charAt(i) >=65 && (int)senha.charAt(i)<=90 || (int)senha.charAt(i) >=97 && (int)senha.charAt(i)<=122) {
    				possuiLetra = true;
    			}
    			else if((int)senha.charAt(i) >=48 && (int)senha.charAt(i)<=57) {
    				numeros++;
    			}
    		}
    	}
    	if(possuiLetra & numeros>=2) {
    		return true;
    	}
    	return false;
    }
    
    public void adicionarUsuario(String login, String senha) {
    	if(validaLogin(login) & validaSenha(senha)) {
    		Cliente novoCliente = new Cliente();
    		novoCliente.setLogin(login);
    		novoCliente.setSenha(senha);
    		this.listaCliente.add(novoCliente);
    	}
    	
    }
}