import java.util.Scanner;

public class text201803_01_Jump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int StreakWin = 0;
        int next = scanner.nextInt();
        while(next != 0){
            if (next == 1){
                score += 1;
                StreakWin = 0;
            } else if (next == 2) {
                StreakWin++;
                score += StreakWin*2;
            }
            next = scanner.nextInt();
        }
        System.out.println(score);
        scanner.close();
    }
}
