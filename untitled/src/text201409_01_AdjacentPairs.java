import java.util.Scanner;

public class text201409_01_AdjacentPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0;i < n;i++){
            for (int j = i + 1;j < n;j++){
                if (list[i] - list[j] == 1 || list[i] - list[j] == -1){
                    result++;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
