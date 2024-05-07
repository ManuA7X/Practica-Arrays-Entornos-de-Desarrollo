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
	
	/**
     * Calcula la mediana de un Array de numeros enteros entre el 0 y el 10.
     *
     * @param notas 						El Array de notas.
     * @return 								La mediana de las notas.
     * @throws IllegalArgumentException 	Si alguna nota no esta entre el 0 y el 10.
     */
	public static double medianaNotas(int [] notas) {
		for (int nota : notas) {
			if(nota < 0 || nota > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre el 0 y el 10.");
			}
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int nota : notas) {
			if(nota < min) {
				min = nota;
				
			}
			if (nota > max) {
				max = nota;
			}	
		}
		
		int [] frecuencia = new int [max - min + 1];
		for (int nota : notas) {
			frecuencia [nota - min]++;
			
		}
		
		int acumulado = 0;
		int medianaPosicion = notas.length / 2;
		int mediana = -1;
		
		for (int i = 0; i < frecuencia.length; i++) {
			acumulado += frecuencia[i];
			if (acumulado >= medianaPosicion) {
				mediana = i + min;
				break;
				
			}
		}
		
		if (notas.length % 2 == 0) {
			int medianaAnterior = -1;
			for (int i = 0; i < frecuencia.length; i++) {
				if (acumulado == medianaPosicion) {
					medianaAnterior = i + min;
				}else if (acumulado > medianaPosicion){
					medianaAnterior = i -1 + min;
					break;
					
				}
				acumulado += frecuencia [i];
				
			}
			return (mediana + medianaAnterior) / 2.0d;
			
		}else {
			return mediana;
			
		}
	}
	
	
}
