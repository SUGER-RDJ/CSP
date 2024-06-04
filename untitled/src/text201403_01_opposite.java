import java.util.Scanner;

public class text201403_01_opposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] list = new int[N];
        for (int i = 0;i < N;i++){
            list[i] = scanner.nextInt();
        }
        int n = 0;
        for (int i = 0;i < N;i++){
            for (int j = i + 1;j < N;j++){
                if (list[i] + list[j] == 0){
                    n++;
                }
            }
        }
        System.out.println(n);
        scanner.close();
    }
}
