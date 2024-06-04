import java.util.Scanner;

public class text201703_01_cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] cakes = new int[n];

        for (int i = 0;i < n;i++){
            cakes[i] = scanner.nextInt();
        }

        int weight = 0;
        int count = 0;
        for (int i = 0;i < n;i++){
            weight += cakes[i];
            if (weight >= k) {
                count++;
                weight = 0;
            }
        }
        if (weight > 0){
            count++;
        }

        System.out.println(count);
        scanner.close();
    }
}
