package Repositorios;

import java.util.SortedSet;
import java.util.TreeSet;

import Entidades.Cliente;
import Sistemas.ComparadorData;

public class RepositorioCliente {
 
    private SortedSet<Cliente> listaCliente = new TreeSet<Cliente>();

    public RepositorioCliente(){}
    
    public boolean validaLogin(String login) {
    	if(login.length()<12 && login.length()>0) {
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
    	if(senha.length()<20 && senha.length()>8) {
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
    
    public boolean validaData(String data){
    	int dia = Integer.parseInt(data.substring(0, 1));
		int mes = Integer.parseInt(data.substring(3, 4));
		int ano = Integer.parseInt(data.substring(6, 9));
		//verifica se o dia está dentro dos dias possíveis
		if(dia <= 31 && dia >= 1){
			//verifica o mês de fevereiro
			if(mes == 2 && dia <= 29){
				//Se o ano não for bissexto e o dia for 29 vai retornar falso
				if((ano % 4)!=0 && dia == 29){
					return false;
				}
				return true;
			}
			//verifica os messes de abril, junho, setembro e novembro 
			else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <=30){
				return false;
			}
			//para o resto dos messes
			return true;
		}
		return false;
    }
    
    public void adicionarUsuario(String login, String senha, String data_nascimento) {
    	if(validaLogin(login) & validaSenha(senha) & validaData(data_nascimento)) {
    		Cliente novoCliente = new Cliente();
    		novoCliente.setLogin(login);
    		novoCliente.setSenha(senha);
    		novoCliente.setdata_nascimento(data_nascimento);
    		this.listaCliente.add(novoCliente);
    	}
    	//retornar erro
    }
    
    public void mostrarClientesNome(){
    	//
    	for(Cliente c : listaCliente){
    		System.out.printf("%s", c.getNome());
    		System.out.println();
    	}
    }
    public void mostrarClientesData(){ 
    	SortedSet<Cliente> listaData = new TreeSet<Cliente>(new ComparadorData());
    	for(Cliente c: listaCliente){
    		listaData.add(c);
    	}
    	for(Cliente c: listaData){
    		System.out.printf("%s - %s", c.getNome(), c.getdata_nascimento().MostrarData());
    		System.out.println();
    	}
    }
}