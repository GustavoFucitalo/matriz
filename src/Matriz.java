import java.util.Scanner;

public class Matriz{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        //TESTANDO O GITHUB
        System.out.println("Quantas linhas terá a matriz? ");
        linha = sc.nextInt();
        System.out.println("Quantas colunas terá a matriz? ");
        coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.println("Elemento ["+ i +","+ j +"]");
                        matriz[i][j] = sc.nextInt();
            }
        }
    System.out.println();
        System.out.println("MATRIZ DIGITADA: ");
        for(int i =0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
            System.out.print(matriz[i][j] + " ");
            }
        System.out.println();
        }
    sc.close();
    }
}