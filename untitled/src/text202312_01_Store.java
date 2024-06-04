import java.util.Scanner;

public class text202312_01_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //录入数据
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //循环遍历数组arr，目的：找到每个仓库的上级仓库
        for (int i = 0;i < n;i++) {
            //定义num为上级仓库的编号，初始化为0
            int num = 0;
            //逆向循环遍历数组，目的：找到最小的上级仓库编号
            for (int j = n - 1;j >= 0;j--) {
                //定义flag用于判断循环到的仓库是否是上级仓库
                boolean flag = true;
                //循环遍历两个小数组，目的：确定flag
                for (int k = 0;k < m;k++) {
                    //判断对应的仓库编码是否不符合上级仓库的定义
                    if (arr[j][k] <= arr[i][k]) {
                        flag = false;
                        //当不符合定义时直接退出本循环
                        break;
                    }
                }
                //如果符合定义，将j + 1赋值给num
                if (flag) {
                    num = j + 1;
                }
            }
            //输出本次循环到的仓库的最小上级仓库
            System.out.println(num);
        }
    }
}
