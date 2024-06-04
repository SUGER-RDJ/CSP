import java.util.Scanner;

public class text202212_01_CurrentValue {
    public static void main(String[] args) {
        Scanner as=new Scanner(System.in);

        int n= as.nextInt();
        double i=as.nextDouble();

        double jieguo=0;
        for (int v=0;v<n+1;v++){
            double p=as.nextDouble();

            if (p>0){     p= jieguo=jieguo+p*(Math.pow((1+i),-v));  }


            else if (p<0){  p=-p; p= jieguo=jieguo-p*(Math.pow((1+i),-v));   }


        }
        System.out.println(jieguo);
        as.close();
    }
}
