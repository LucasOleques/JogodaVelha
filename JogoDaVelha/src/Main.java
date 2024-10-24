import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char [][] tabuleiro= new char[3][3];

        IniciarTab.iniciarTabuleiro(tabuleiro);
        ImprimirTab.imprimirTabuleiro(tabuleiro);

        System.out.println("Digite a posição da linha (1,2 ou 3): ");
        int linha = scan.nextInt() - 1;
        System.out.println("Digite a posição da coluna (1,2 ou 3): ");
        int coluna = scan.nextInt() - 1;
        System.out.println("Escolhe entre 'X' e 'O': ");
        char escolha = scan.next().charAt(0);

        if (linha >= 0) {
            if (linha < 3) {
                if (coluna >= 0) {
                    if (coluna < 3) {
                        if (tabuleiro[linha][coluna] == ' ') {
                            tabuleiro[linha][coluna] = escolha; // Adiciona a escolha
                        } else {
                            System.out.println("Posição já ocupada.");
                        }
                    } else {
                        System.out.println("Coluna inválida. Deve ser entre 1 e 3.");
                    }
                } else {
                    System.out.println("Coluna inválida. Deve ser entre 1 e 3.");
                }
            } else {
                System.out.println("Linha inválida. Deve ser entre 1 e 3.");
            }
        } else {
            System.out.println("Linha inválida. Deve ser entre 1 e 3.");
        }

        ImprimirTab.imprimirTabuleiro(tabuleiro);
        scan.close();
    }
}