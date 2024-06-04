import java.util.Arrays;
import java.util.Scanner;

public class text202009_01_MonPoint {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int n=as.nextInt();
        int x=as.nextInt();
        int y=as.nextInt();
        double[] a=new double[n];
        double[] b=new double[n+1];

        for (int i = 0; i < n ; i++) {
            int ix=as.nextInt();
            int iy=as.nextInt();

            a[i]=Math.sqrt(  Math.pow(x-ix, 2)+Math.pow(y-iy, 2)  );
            b[i+1]=a[i];
        }

        Arrays.sort(a);
        for (int i = 0; i < 3; i++) {
            for(int j=1;j<b.length;j++) {
                if(a[i]==b[j]) {
                    System.out.println(j);
                    b[j]+=1000;  //报废此功能点
                    break;
                }
            }
        }
        as.close();
    }
}
