import java.util.Scanner;
import java.util.LinkedList;

class Window {
    int id = 0;
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
}

public class text201403_02_Windows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList<Window> wl = new LinkedList<Window>();
        int[][] click = new int[m][2];
        for(int i = 1; i <= n; i++) {
            Window w = new Window();
            w.id = i;
            w.x1 = sc.nextInt();
            w.y1 = sc.nextInt();
            w.x2 = sc.nextInt();
            w.y2 = sc.nextInt();
            wl.add(w);
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                click[i][j] = sc.nextInt();
            }
        }
        Window temp = new Window();
        for(int i = 0; i < m; i++) {
            int flag = 0;
            for(int j = n - 1; j >= 0; j--) {
                if(click[i][0] >= wl.get(j).x1 && click[i][0] <= wl.get(j).x2 && click[i][1] >= wl.get(j).y1 && click[i][1] <= wl.get(j).y2) {
                    System.out.println(wl.get(j).id);
                    temp = wl.get(j);
                    wl.remove(j);
                    wl.addLast(temp);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("IGNORED");
            }
        }
    }
}
