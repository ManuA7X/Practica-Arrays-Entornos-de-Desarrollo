package tests;

import static org.junit.jupiter.api.Assertions.*;
import util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Junit_testMedia {
	
	private static int[] notasValidas;
    private static int[] notasInvalidas;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 notasValidas = new int[]{7, 5, 9, 8, 6};
	     notasInvalidas = new int[]{-7, 12, 19, -8, 11};
	}

	@Test
	void testMediasNotas() {
		double media = Arrays.mediaNotas(notasValidas);
        assertEquals(7.0, media);
	}
	
	@Test
    public void testMediaNotasInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> Arrays.mediaNotas(notasInvalidas));
    }
	
	@Test
    public void testMedianaNotas() {
        double mediana = Arrays.medianaNotas(notasValidas);
        assertEquals(6.0, mediana);
    }

    @Test
    public void testMedianaNotasInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> Arrays.medianaNotas(notasInvalidas));
    }

    @Test
    public void testMaximaNota() {
        int maxima = Arrays.maximaNota(notasValidas);
        assertEquals(9, maxima);
    }

    @Test
    public void testMaximaNotaInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> Arrays.maximaNota(notasInvalidas));
    }

    @Test
    public void testMinimaNota() {
        int minima = Arrays.minimaNota(notasValidas);
        assertEquals(5, minima);
    }

    @Test
    public void testMinimaNotaInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> Arrays.minimaNota(notasInvalidas));
    }

}
