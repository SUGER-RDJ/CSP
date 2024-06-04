import java.util.Scanner;

public class text201604_01_FloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int flag = 0;
        for (int i = 2;i < n;i++){
            if ((list[i] - list[i - 1] < 0 && list[i - 1] - list[i - 2] > 0)
            ||(list[i] - list[i - 1] > 0 && list[i - 1] - list[i - 2] < 0)){
                flag++;
            }
        }
        System.out.println(flag);
        scanner.close();
    }
}
