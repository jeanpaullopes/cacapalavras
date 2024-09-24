import java.util.ArrayList;
import java.util.List;

public class CacaLetras {
    public CacaLetras() {

    }
    public List<String> buscaPalavras(char[][] letras, int linha, 
                                      int coluna,boolean[][] visitados,
                                      List<String> palavras){
        List<String> palvras = new ArrayList<>();
        if (visitados == null) {
            visitados = new boolean[letras.length][letras[0].length];
        }
        visitados[linha][coluna] = true;
        try {
            if (!visitados[linha-1][coluna-1]) {
                palvras.addAll(buscaPalavras(letras, linha-1, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha-1][coluna]) {
                palvras.addAll(buscaPalavras(letras, linha-1, coluna, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha-1][coluna+1]) {
                palvras.addAll(buscaPalavras(letras, linha-1, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }


        try {
            if (!visitados[linha][coluna-1]) {
                palvras.addAll(buscaPalavras(letras, linha, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha][coluna+1]) {
                palvras.addAll(buscaPalavras(letras, linha, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }



        try {
            if (!visitados[linha+1][coluna-1]) {
                palvras.addAll(buscaPalavras(letras, linha+1, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha+1][coluna]) {
                palvras.addAll(buscaPalavras(letras, linha+1, coluna, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha+1][coluna+1]) {
                palvras.addAll(buscaPalavras(letras, linha+1, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }


        List<String> temp = new ArrayList<>();
        for (String palavra : palvras) {
            temp.add(String.valueOf(letras[linha][coluna]) + palavra);
        }
        palvras.addAll(temp);
        if (palvras.isEmpty()) {
            palvras.add(String.valueOf(letras[linha][coluna]));
        }
        if (letras[linha][coluna] == 'a') {
           System.out.println("a");
        }
        return palvras; 

    }
}
