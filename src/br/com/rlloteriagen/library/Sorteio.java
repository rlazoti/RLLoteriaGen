package br.com.rlloteriagen.library;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

abstract class Sorteio {

	private Random gerador;

	abstract int[] sortearSequencia();

	private void iniciarGerador() {
		this.gerador = new Random( System.currentTimeMillis() );
	}

	private int sortearNumero( int numeroMaximo, int numeroMinimo ) {
		int numero = 0;

		do {
			numero = Math.abs( ( this.gerador.nextInt() % numeroMaximo ) + 1 );
		} while ( numero < numeroMinimo );

		return numero;
	}

	public final int[] sortearSequencia( int numeroMaximo, int numeroMinimo, int quantidade ) {
		Set<Integer> sequencia = new TreeSet<Integer>();
		int[] resultado = new int[quantidade];

		do {
			sequencia.add( this.sortearNumero( numeroMaximo, numeroMinimo ) );
		} while ( sequencia.size() < quantidade );

		for ( int i = 0; i < quantidade; i++ ) {
			resultado[i] = ( ( Integer ) sequencia.toArray()[i] ).intValue();
		}
		
		return resultado;
	}

	public Sorteio() {
		this.iniciarGerador();
	}
}