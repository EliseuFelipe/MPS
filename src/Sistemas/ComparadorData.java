package Sistemas;

import java.util.Comparator;

import Entidades.Cliente;

public class ComparadorData implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		//A função irá retornar positivo se c1 for mais velho que c2
		if(c1.getdata_nascimento().getAno() < c2.getdata_nascimento().getAno()){
			return -1;
		}
		if(c1.getdata_nascimento().getAno() > c2.getdata_nascimento().getAno()){
			return 1;
		}
		if(c1.getdata_nascimento().getMes() < c2.getdata_nascimento().getMes()){
			return -1;
		}
		if(c1.getdata_nascimento().getMes() > c2.getdata_nascimento().getMes()){
			return 1;
		}
		if(c1.getdata_nascimento().getDia() < c2.getdata_nascimento().getDia()){
			return -1;
		}
		if(c1.getdata_nascimento().getDia() > c2.getdata_nascimento().getDia()){
			return 1;
		}
		return 0;
	}

}
