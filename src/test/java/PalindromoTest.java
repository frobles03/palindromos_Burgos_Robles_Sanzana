import static org.junit.Assert.*;

public class PalindromoTest {
    Palindromo p;
    @org.junit.Before
    public void setUp() throws Exception {
        p = new Palindromo();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void esPalindromo() {
        //Burgos
        assertTrue(p.esPalindromo("Anita lava la tina"));
        assertFalse(p.esPalindromo("gatito"));
        assertTrue(p.esPalindromo("alli ves a sevilla"));
        assertFalse(p.esPalindromo("anita no lava la tina"));
        assertTrue(p.esPalindromo("4n1t4 l4v4 l4 t1n4"));
        //Robles
        assertTrue(p.esPalindromo("1 anita lava la tina 1"));
        assertTrue(p.esPalindromo("añita lava la tiña"));
        assertFalse(p.esPalindromo("All-í va Ram3ón y no mar4avi_lla"));
        assertFalse(p.esPalindromo("anita, lava, la, tina"));
        assertTrue(p.esPalindromo("°|!#$%&/()=?'¡¿´¨+*~}]`{[^,;.:-__-:.;,^[{`]}~*+¨´¿¡'?=)(/&%$#!|°"));
        //Profesor
        assertFalse(p.esPalindromo("200"));
        assertTrue(p.esPalindromo("aaabccbaaa"));
        assertFalse(p.esPalindromo("ahabccbaaa"));
        assertTrue(p.esPalindromo("La tele letal"));
        assertTrue(p.esPalindromo(""));
    }
}