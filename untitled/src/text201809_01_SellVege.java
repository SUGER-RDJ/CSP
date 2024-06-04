import java.util.Scanner;

public class text201809_01_SellVege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int[] finnal = new int[n];
        for (int i = 0;i < n;i++){
            if (i == 0){
                finnal[i] = (list[i] + list[i + 1])/2;
            } else if (i == n-1) {
                finnal[i] = (list[i] + list[i - 1])/2;
            }else {
                finnal[i] = (list[i] + list[i + 1] + list[i - 1])/3;
            }
        }
        for (int i = 0;i < n;i++){
            System.out.print(finnal[i] + " ");
        }
    }
}
