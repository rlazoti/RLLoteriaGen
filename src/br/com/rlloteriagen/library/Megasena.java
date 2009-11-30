package br.com.rlloteriagen.library;

public class Megasena extends Sorteio {
	private static final int NUMERO_MINIMO = 1;
	private static final int NUMERO_MAXIMO = 60;
	private static final int QUANTIDADE = 6;

	public Megasena() {
	}

	public int[] sortearSequencia() {
		return super.sortearSequencia( NUMERO_MAXIMO, NUMERO_MINIMO, QUANTIDADE );
	}
}