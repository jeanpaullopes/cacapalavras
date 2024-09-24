import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        char letras[][] = new char[4][3];
        letras[0][0] = 'a';
        letras[0][1] = 'b';
        letras[0][2] = 'c';
        letras[1][0] = 'd';
        letras[1][1] = 'e';
        letras[1][2] = 'f';
        letras[2][0] = 'g';
        letras[2][1] = 'h';
        letras[2][2] = 'i';
        letras[3][0] = 'j';
        letras[3][1] = 'k';
        letras[3][2] = 'l';
 
        CacaLetras cacaLetras = new CacaLetras();
        List<String> palavras = cacaLetras.buscaPalavras(letras, 0, 0, null, null);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }
}