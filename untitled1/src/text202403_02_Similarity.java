import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class text202403_02_Similarity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取两篇文章的单词个数
        int n = scanner.nextInt(); // 第一篇文章的单词个数
        int m = scanner.nextInt(); // 第二篇文章的单词个数
        scanner.nextLine(); // 消耗换行符

        // 创建两个Set集合，用于存储两篇文章的单词，自动去重
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        // 读取第一篇文章的单词，转换为小写并添加到SetA中
        String lineA = scanner.nextLine();
        String[] wordsA = lineA.toLowerCase().split("\\s+");
        for (String word : wordsA) {
            setA.add(word);
        }

        // 读取第二篇文章的单词，转换为小写并添加到SetB中
        String lineB = scanner.nextLine();
        String[] wordsB = lineB.toLowerCase().split("\\s+");
        for (String word : wordsB) {
            setB.add(word);
        }

        // 计算交集
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // 计算并集
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);

        // 输出结果
        System.out.println(intersection.size()); // 输出交集的大小
        System.out.println(union.size()); // 输出并集的大小

        scanner.close();
    }
}
