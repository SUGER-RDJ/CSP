import java.util.Scanner;

public class text201912_01_NumberOFF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] res = new int[4];
        int i = 0;
        int count = 0;
        do {
            i++;
            if (i % 7 ==0 || Integer.toString(i).contains("7")){
                int num = i % 4;
                res[num]++;
            }else {
                count++;
            }
        }while (count != n);
        scanner.close();
        System.out.println(res[1]);
        System.out.println(res[2]);
        System.out.println(res[3]);
        System.out.println(res[0]);

    }
}
