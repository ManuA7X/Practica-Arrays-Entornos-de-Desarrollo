package util;

public abstract class Arrays {
	
	/**
     * Calcula la media de un Array de numeros enteros entre el 0 y el 10.
     *
     * @param notas 						El Array de notas.
     * @return 								La media de las notas.
     * @throws IllegalArgumentException 	Si alguna nota no esta entre el 0 y el 10.
     */
	public static double mediaNotas(int [] notas) {
		for (int nota : notas) {
			if(nota < 0 || nota > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre el 0 y el 10.");
			}
		}
		
		int suma = 0;
		for (int nota : notas) {
			suma += nota;
		}
		return (double) suma / notas.length;
		
	}
	
	
}
