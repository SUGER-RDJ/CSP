import java.util.Scanner;

public class text202012_01_SafeIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] Re = new int[n][2];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < 2;j++){
                Re[i][j] = scanner.nextInt();
            }
        }
        int result = 0;
        for (int i = 0;i < n;i++){
            result += Re[i][0] * Re[i][1];
        }
        if (result > 0){
            System.out.println(result);
        }else {
            System.out.println("0");
        }
        scanner.close();
    }
}
