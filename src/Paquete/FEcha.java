package Paquete;

public class FEcha {
	int dia;
	int mes; 
	int a�o;
	public FEcha()
	{
		dia=0;
		mes=0;
		a�o=0;
	}
	public FEcha(int dia, int mes, int a�o) 
	{
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
}
