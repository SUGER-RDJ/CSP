import java.util.Scanner;

public class text201412_01_GuardSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int[] count = new int[n + 1];
       for (int i = 0;i < n;i++){
           int m = scanner.nextInt();
           count[m]++;
           System.out.print(count[m] + " ");
       }
        scanner.close();
    }
}
