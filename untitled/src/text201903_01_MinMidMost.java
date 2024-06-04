import java.util.Arrays;
import java.util.Scanner;

public class text201903_01_MinMidMost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        if (n % 2 != 0){
            System.out.println(list[n - 1]+" "+list[n/2]+" "+list[0]);
        }else {
            if ((list[(n-1)/2]+list[(n+1)/2])%2 == 0){
                System.out.printf("%d %d %d",list[n-1],(list[(n-1)/2]+list[(n+1)/2])/2,list[0]);
            }else {
                System.out.printf("%d %.1f %d",list[n-1],(list[(n-1)/2]+list[(n+1)/2])/2.0,list[0]);
            }
        }
        scanner.close();
    }
}
