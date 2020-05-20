import static org.apache.commons.lang3.StringUtils.*;

public class Palindromo {

    //Sanzana
    boolean esPalindromo(String palabra){
        String inversa="";

        palabra=palabra.replaceAll("\\s","");
        palabra = stripAccents(palabra);
        for(int i=palabra.length()-1;i>=0;i--){
            inversa+=palabra.charAt(i);
        }
        System.out.println(inversa);
        return palabra.equalsIgnoreCase(inversa);
    }
}
