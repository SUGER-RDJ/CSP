import java.util.*;
import java.io.*;

public class  text202312_02_Factor{
    static QuickInput in = new QuickInput();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int max = 100007;

    public static void main(String[] args) throws IOException {
        long q = in.nextLong();
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < max; i++) check(i, list);
        for (int i = 0; i < q; i++) {
            long n = in.nextLong(), k = in.nextLong();
            long ans = n;
            int[] cnt = new int[max];
            for (int j : list) {
                if (n == 1) break;
                while (n % j == 0) {
                    n /= j;
                    cnt[j]++;
                }
            }

            ans /= n;
            for (int j = 0; j < max; j++) {
                if (cnt[j] < k && cnt[j] != 0) {
                    ans /= Math.pow(j, cnt[j]);
                }
            }

            out.println(ans);
        }
        out.flush();
    }

    static void check(int n, List<Integer> list) {
        for (int i : list) {
            if (i * i > n) break;
            if (n % i == 0) return;
        }
        list.add(n);
    }

    static class QuickInput {
        StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        long nextLong() throws IOException {
            input.nextToken();
            return (long) input.nval;
        }
    }
}