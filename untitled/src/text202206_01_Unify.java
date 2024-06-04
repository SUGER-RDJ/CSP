import java.util.Scanner;

public class text202206_01_Unify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for (int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0;i < n;i++){
            sum += arr[i];
        }
        double mean = 0;
        mean = sum / n;
        double var = 0;
        double he = 0;
        for (int i = 0;i < n;i++){
            he += Math.pow(arr[i] - mean , 2);
        }
        var = he / n;
        for (int i = 0;i < n;i++){
            double result = (arr[i] - mean)/Math.sqrt(var);
            System.out.println(result);
        }
    }
}
