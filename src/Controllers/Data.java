package Sistemas;

public class Data {
	private int dia, mes, ano;
	
	public Data(){}
	
	public Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void DefinirData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void DefinirData(String data){
		dia = Integer.parseInt(data.substring(0, 1));
		mes = Integer.parseInt(data.substring(3, 4));
		ano = Integer.parseInt(data.substring(6, 9));
	}
	
	public String MostrarData(){
		String strDia, strMes;
		strDia = (dia < 10) ? "0" + dia : "" + dia;
		strMes = (mes < 10) ? "0" + mes : "" + mes;
		
		return "" + strDia + "/" + strMes + "/" + ano;
	}
	
	public int getDia(){
		return dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getMes(){
		return mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}

}
