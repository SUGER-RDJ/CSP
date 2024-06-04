import java.util.Scanner;

public class text201612_01_middleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int list[] = new int[n];
        for (int i = 0;i < n;i++){
            list[i] = scanner.nextInt();
        }
        int flag = 0;
        for (int i = 0;i < n;i++){
            int left = 0;
            int right = 0;
            for (int j = 0;j < n;j++){
                if (list[i] > list[j]){
                    left++;
                } else if (list[i] < list[j]) {
                    right++;
                }
            }
            if (left == right){
                System.out.println(list[i]);
                flag++;
                break;
            }
        }
        if (flag == 0){
            System.out.println("-1");
        }
    }
}
