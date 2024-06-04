import java.util.HashMap;
import java.util.Scanner;

public class text202305_01_Recur {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            String str = "";
            for(int j = 0;j<8;j++){
                str += sc.next();
            }
            map.put(str,map.getOrDefault(str,0)+1);
            System.out.println(map.get(str));
        }

    }
}
