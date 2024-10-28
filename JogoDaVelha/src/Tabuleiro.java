public class Tabuleiro {

    //Imprimir o tabuleiro
    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (char i = 0; i < 3; i++) {
            System.out.print("| ");
            for (char y = 0; y < 3; y++) {
                System.out.print(tabuleiro[i][y] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    //Inicializador do tabuleiro
    public static void iniciarTabuleiro(char[][] tabuleiro){
        for(char i = 0; i < 3; i++) {
            for (char y = 0; y < 3; y++){
                tabuleiro[i][y] = ' ';
            }
        }
    }
    // Função que verifica se o tabuleiro ainda tem posições vazias
    public static boolean tabuleiroPreenchido(char[][] tabuleiro) {
        for(char i = 0; i < 3; i++) {
            for (char y = 0; y < 3; y++) {
                if (tabuleiro[i][y] == ' ') {
                    return true;   // Ainda há espaço vazio
                }
            }
        }   return false; // Não há mais espaços vazios
    }

    // Função para verificar vitória
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Verifica linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador){
                if(tabuleiro[i][1] == jogador){
                    if(tabuleiro[i][2] == jogador){
                        return true;
                    }
                }
            }
        }
        // Verifica colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador){
                if (tabuleiro[1][i] == jogador){
                    if (tabuleiro[2][i] == jogador){
                        return true;
                    }
                }
            }
        }
        // Verifica diagonais
        if (tabuleiro[0][0] == jogador){
            if(tabuleiro[1][1] == jogador){
                if(tabuleiro[2][2] == jogador){
                    return true;
                }
            }
        }
        if (tabuleiro[0][2] == jogador){
            if(tabuleiro[1][1] == jogador){
                if(tabuleiro[2][0] == jogador){
                    return true;
                }
            }
        }
        return false;
    }
}
