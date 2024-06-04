import java.util.Scanner;

public class text202112_01_Alignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int sum = 0;
        int now = 1;
        for (int i = 1;i < n;i++){
            sum += (list[i] - list[i - 1]) * now;
            now++;
        }
        sum += (N - list[n - 1]) * now;
        System.out.println(sum);
        scanner.close();
    }
}
