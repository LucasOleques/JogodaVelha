public class ImprimirTab {
    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (char i = 0; i < 3; i++) {
            System.out.print("| ");
            for (char j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
