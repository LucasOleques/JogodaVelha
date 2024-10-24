public class IniciarTab {
    public static void iniciarTabuleiro(char[][] tabuleiro){
        for(char i = 0; i < 3; i++) {
            for (char y = 0; y < 3; y++){
                tabuleiro[i][y] = ' ';
            }
        }
    }
}
