package br.univel.interfaces;

public class Exemplo {
	public Exemplo(){
		Calcular c1 = new Soma();
		Calcular c2 = new Multiplicacao();
		
		int r1 = c1.calcular(2, 3);
		int r2 = c2.calcular(2, 3);
		
		Calcular c3 = new Calcular() {
			@Override
			public int calcular(int a, int b) {
				return a - b;
			}
		};
		int r3 = c3.calcular(3, 2);
	}
	
	public static void main(String[] args) {
		new Exemplo();
	}
}
