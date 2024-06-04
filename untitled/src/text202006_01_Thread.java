import java.util.Scanner;

public class text202006_01_Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a=new int[2][n];
        char[] t=new char[n];
        int A=0;
        int B=0;
        for(int i=0;i<n;i++){

            a[0][i]=sc.nextInt();
            a[1][i]=sc.nextInt();
            t[i]=sc.next().charAt(0);
            if(t[i]=='A') A++;
            if(t[i]=='B') B++;

        }

        int[] sign=new int[n];
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            int b0=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            char c;
            for(int j=0;j<n;j++){

                int x= b0+b1*a[0][j]+b2*a[1][j];
                if(x>0){
                    sign[j]=1;
                }else if(x<0){
                    sign[j]=-1;
                }
            }
            int a1=0;
            int a2=0;
            int b11=0;
            int b22=0;
            for(int j=0;j<n;j++){

                if(t[j]=='A'&&sign[j]==1){
                    a1++;
                }else if(t[j]=='A'&&sign[j]==-1){
                    a2++;
                }else if(t[j]=='B'&&sign[j]==1){
                    b11++;
                }else if(t[j]=='B'&&sign[j]==-1){
                    b22++;
                }


            }
            if(a1==A||a2==A){
                if(b11==B||b22==B){
                    res[i]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(res[i]==1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
