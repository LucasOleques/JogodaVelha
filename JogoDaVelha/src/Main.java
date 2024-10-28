import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char [][] tabuleiro= new char[3][3];
        Tabuleiro.iniciarTabuleiro(tabuleiro);

        char jogador;

        while(Tabuleiro.tabuleiroPreenchido(tabuleiro)) {
            Tabuleiro.imprimirTabuleiro(tabuleiro);

            System.out.println("Digite a posição da linha (1,2 ou 3): ");
            int linha = scan.nextInt() - 1;
            System.out.println("Digite a posição da coluna (1,2 ou 3): ");
            int coluna = scan.nextInt() - 1;
            System.out.println("Escolhe entre 'X' e '0': ");
            jogador = scan.next().charAt(0);

            if (linha >= 0) {
                if (linha < 3) {
                    if (coluna >= 0) {
                        if (coluna < 3) {
                            if (tabuleiro[linha][coluna] == ' ') {
                                tabuleiro[linha][coluna] = jogador; // Adiciona a escolha
                                if(Tabuleiro.verificarVitoria(tabuleiro,jogador)){
                                    Tabuleiro.imprimirTabuleiro(tabuleiro);
                                    System.out.println("Vitória do jogador: " + jogador);
                                    return;
                                } else {
                                    System.out.println("Próximo jogador...\n");
                                }
                            } else {
                                System.out.println("Posição já ocupada.\n");
                            }
                        } else {
                            System.out.println("Coluna inválida. Deve ser entre 1 e 3.\n");
                        }
                    } else {
                        System.out.println("Coluna inválida. Deve ser entre 1 e 3.\n");
                    }
                } else {
                    System.out.println("Linha inválida. Deve ser entre 1 e 3.\n");
                }
            } else {
                System.out.println("Linha inválida. Deve ser entre 1 e 3.\n");
            }
        }
        Tabuleiro.imprimirTabuleiro(tabuleiro);
        System.out.println("Empate. O tabuleiro está completo.");
        scan.close();
    }
}