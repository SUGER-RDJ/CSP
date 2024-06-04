import java.util.Scanner;

public class text201503_01_Revolve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] list = new int[n][m];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                list[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print(list[n - (n - j)][m - (i + 1)] + " ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
