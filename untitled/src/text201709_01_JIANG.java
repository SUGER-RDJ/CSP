import java.util.Scanner;

public class text201709_01_JIANG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int n = money/10;

        int gift2 = n/5;
        int left = n % 5;
        int gift1= left/3;
        int least = left % 3;

        int sum = gift2 * (5 + 2) + gift1 * (3 + 1) + least;
        System.out.println(sum);

        scanner.close();
    }
}
