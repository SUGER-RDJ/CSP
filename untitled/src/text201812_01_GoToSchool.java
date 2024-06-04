import java.util.Scanner;

public class text201812_01_GoToSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();

        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0;i < n;i++){
            int k = scanner.nextInt();
            int t = scanner.nextInt();
            if (k == 0 || k == 1){
                result += t;
            } else if (k == 2) {
                result += t;
                result += r;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
