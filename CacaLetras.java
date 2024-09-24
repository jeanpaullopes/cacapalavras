import java.util.ArrayList;
import java.util.List;

public class CacaLetras {
    public CacaLetras() {

    }
    public List<String> buscaPalavras(char[][] letras, int linha, 
                                      int coluna,boolean[][] visitados,
                                      List<String> palavras){
        if (palavras == null) {
            palavras = new ArrayList<>();
            palavras.add(letras[linha][coluna]+"");
        } else {
            List<String> novasPalavras = new ArrayList<>();
                
            for (String palavra : palavras) {
                novasPalavras.add(palavra+letras[linha][coluna]);
            }
            palavras.addAll(novasPalavras);
        }
        if (visitados == null) {
            visitados = new boolean[letras.length][letras[0].length];
        }
        visitados[linha][coluna] = true;
        try {
            if (!visitados[linha-1][coluna-1]) {
                palavras.addAll(buscaPalavras(letras, linha-1, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha-1][coluna]) {
                palavras.addAll(buscaPalavras(letras, linha-1, coluna, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha-1][coluna+1]) {
                palavras.addAll(buscaPalavras(letras, linha-1, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }


        try {
            if (!visitados[linha][coluna-1]) {
                palavras.addAll(buscaPalavras(letras, linha, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha][coluna+1]) {
                palavras.addAll(buscaPalavras(letras, linha, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }



        try {
            if (!visitados[linha+1][coluna-1]) {
                palavras.addAll(buscaPalavras(letras, linha+1, coluna-1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha+1][coluna]) {
                palavras.addAll(buscaPalavras(letras, linha+1, coluna, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        try {
            if (!visitados[linha+1][coluna+1]) {
                palavras.addAll(buscaPalavras(letras, linha+1, coluna+1, visitados, palavras));
            }
        }catch (IndexOutOfBoundsException e) {
        }


        for (String palavra : palavras) {
            System.out.println(palavra);
        }


        return palavras; 

    }
}
