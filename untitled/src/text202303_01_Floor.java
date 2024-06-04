import java.util.Scanner;

public class text202303_01_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int x1, y1, x2, y2;
        int x, y;
        for (int i = 1; i <= n; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            x = Math.min(a, x2) - Math.max(0, x1);
            y = Math.min(b, y2) - Math.max(0, y1);
            if (x > 0 && y > 0) {
                sum += x * y;
            }
        }
        System.out.print(sum);
        sc.close();
    }
}
