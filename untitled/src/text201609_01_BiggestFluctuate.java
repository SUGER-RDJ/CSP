import java.util.Scanner;

public class text201609_01_BiggestFluctuate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 1;i < n;i++){
            if (Math.abs(list[i] - list[i - 1]) > result){
                result = Math.abs(list[i] - list[i - 1]);
            }
        }
        System.out.println(result);
    }
}
