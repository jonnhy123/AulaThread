package br.univel.interfaces;

public class Soma implements Calcular{
	@Override
	public int calcular(int a, int b) {
		return a+b;
	}
}
