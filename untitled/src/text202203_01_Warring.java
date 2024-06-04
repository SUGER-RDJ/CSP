import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//使用Array会超时
public class text202203_01_Warring {
    public static void main(String[] args) throws IOException {
        HashSet set = new HashSet();
        set.add(0);;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] param = br.readLine().split(" ");
        int n = Integer.parseInt(param[0]);
        int k = Integer.parseInt(param[1]);
        int x, y;
        int cnt = 0;
        while(k != 0){
            k--;
            param = br.readLine().split(" ");
            x = Integer.parseInt(param[0]);
            y = Integer.parseInt(param[1]);
            if(!set.contains(y)) cnt++;
            set.add(x);
        }
        System.out.println(cnt);
        br.close();

    }
}
