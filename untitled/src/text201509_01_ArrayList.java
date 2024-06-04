import java.util.Scanner;

public class text201509_01_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int result = 1;
        for (int i = 1;i < n;i++){
            if (list[i] - list[i - 1] != 0){
                result++;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
