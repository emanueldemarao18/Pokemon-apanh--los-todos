import java.util.HashSet;
import java.util.Scanner;

//OBS:  MAIÚSCULOS E MINUSCULOS NÃO FAZEM DIFERENÇA
class Main {

    public static void main(String[] args) {

        int linha = 1, coluna = 1;
        HashSet<String> posicoes = new HashSet<>();
        posicoes.add(linha + ":" + coluna);
        Scanner read = new Scanner(System.in);
        String caminho = read.nextLine().toUpperCase();

        for (char letras : caminho.toCharArray()) {
            switch (letras) {
                case 'N':
                    linha -= 1;
                    break;

                case 'S':
                    linha += 1;
                    break;

                case 'O':
                    coluna -= 1;
                    break;

                case 'E':
                    coluna += 1;
                    break;
            }
            posicoes.add(linha + ":" + coluna);
        }
        System.out.println(posicoes.size());
    }
}