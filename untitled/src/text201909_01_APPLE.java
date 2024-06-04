import java.util.Scanner;

public class text201909_01_APPLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] Apple = new int[n][m + 1];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m+1;j++){
                Apple[i][j] = scanner.nextInt();
            }
        }
        int result = 0;
        int SUM = 0;
        int biggest = 1;
        for (int i = 0;i < n;i++){
            int Now = 0;
            for (int j= 1;j < m+1;j++){
                Now += Math.abs(Apple[i][j]);
                SUM += Math.abs(Apple[i][j]);
            }
            if (Now > result){
                result = Now;
                biggest = i+1;
            }
        }
        int sum = 0;
        for (int i = 0;i < n;i++){
            sum += Apple[i][0];
        }
        System.out.println((sum-SUM) +" "+biggest+" "+result);
    }
}
