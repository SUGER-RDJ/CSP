import java.util.Scanner;

public class text202104_01_Grey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        int[] gray = new int[n*m];
        for (int i = 0;i < n*m;i++){
            gray[i] = scanner.nextInt();
        }
        int[] h = new int[l];
        for (int i = 0;i < l;i++){
            int sum = 0;
            for (int j = 0;j < n*m;j++){
                if (gray[j] == i){
                    sum++;
                }
            }
            h[i] = sum;
        }
        for (int i = 0;i < l;i++){
            System.out.print(h[i] + " ");
        }
        scanner.close();
    }
}
