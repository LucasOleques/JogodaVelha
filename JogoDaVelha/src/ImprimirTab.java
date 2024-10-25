public class ImprimirTab {
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
}
