package br.univel.interfaces;

public class Multiplicacao implements Calcular{
	@Override
	public int calcular(int a, int b) {
		return a*b;
	}
}
