import java.util.Scanner;

public class text201712_01_MinSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int sub = Math.abs(list[1] - list[0]);
        for (int i = 0;i < n;i++){
            for (int j = i + 1;j < n;j++){
                if (Math.abs(list[i] - list[j]) < sub){
                    sub = Math.abs(list[i] - list[j]);
                }
            }
        }
        System.out.println(sub);
        scanner.close();
    }
}
