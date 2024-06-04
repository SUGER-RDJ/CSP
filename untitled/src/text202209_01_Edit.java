import java.util.Scanner;

public class text202209_01_Edit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a =new int[n];
        for (int i = 0;i < n;i++){
            a[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        c[0] = 1;
        for (int i = 1;i < n;i++){
            for (int j = 0;j < i;j++){
                c[i] = c[i-1] * a[j];
            }
        }
        int[] b = new int[n];
        int left = m;
        for (int i = n-1;i >= 0;i--){
            b[i] = left / c[i];
            left = m % c[i];
        }
        for (int i = 0;i < n;i++){
            System.out.print(b[i] + " ");
        }
        scanner.close();
    }
}
