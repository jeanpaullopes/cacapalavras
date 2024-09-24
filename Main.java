import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        char letras[][] = new char[4][3];
        letras[0][0] = 'e';
        letras[0][1] = 'l';
        letras[0][2] = 'i';
        letras[1][0] = 'j';
        letras[1][1] = 'e';
        letras[1][2] = 'p';
        letras[2][0] = 'a';
        letras[2][1] = 'f';
        letras[2][2] = 'e';
        letras[3][0] = 'o';
        letras[3][1] = 'n';
        letras[3][2] = 't';
        try{
        File file = new File("./br-sem-acentos.txt");
        Scanner scanner = new Scanner(file);
        List<String> brsemacentos = new ArrayList<>();
        while (scanner.hasNext()) {
            brsemacentos.add(scanner.next());
        }
        scanner.close();

        if (brsemacentos.stream().filter(palavra -> palavra.startsWith("ca")).findFirst().isPresent()) {
            System.out.println("Achou a palavra casa");
        }else {
            System.out.println("Não achou a palavra casa");
        }

//        for (String palavra : brsemacentos) {
//            System.out.println(palavra);
//        }
    }catch (Exception e) {
        System.out.println("Erro ao ler arquivo");
        System.out.println(e.getMessage());
    }

        CacaLetras cacaLetras = new CacaLetras();
        List<String> palavras = cacaLetras.buscaPalavras(letras, 0, 0, null, null);
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }
}