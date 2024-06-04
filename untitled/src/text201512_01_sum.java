import java.util.Scanner;

public class text201512_01_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
