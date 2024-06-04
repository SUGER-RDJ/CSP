import java.util.Scanner;

public class text202109_01_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int sumMax = arr[0];
        int sumMin = arr[0];
        for (int i = 1;i < n;i++){
            if (arr[i] > arr[i - 1]){
                sumMin += arr[i];
                sumMax += arr[i];
            } else if (arr[i] == arr[i - 1]) {
                sumMax += arr[i];
            }
        }
        System.out.println(sumMax);
        System.out.println(sumMin);
        scanner.close();
    }
}
