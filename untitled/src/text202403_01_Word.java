
import java.util.*;

public class text202403_01_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取文章篇数和单词编号上限
        int n = scanner.nextInt(); // 文章篇数
        int m = scanner.nextInt(); // 单词编号上限

        // 使用HashMap来存储每个单词及其出现的文章数和总出现次数
        Map<Integer, ArticleWordCount> wordMap = new HashMap<>();

        // 读取每篇文章的内容
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt(); // 读取当前文章的长度
            for (int j = 0; j < l; j++) {
                int wordId = scanner.nextInt(); // 读取单词编号
                ArticleWordCount awc = wordMap.getOrDefault(wordId, new ArticleWordCount());
                awc.count++; // 增加该单词的出现次数
                awc.articles.add(i); // 将文章编号添加到文章列表中
                wordMap.put(wordId, awc); // 更新HashMap
            }
        }

        // 输出每个单词的文章数和出现次数
        for (Map.Entry<Integer, ArticleWordCount> entry : wordMap.entrySet()) {
            int wordId = entry.getKey();
            ArticleWordCount awc = entry.getValue();
            System.out.println(awc.articles.size() + " " + awc.count);
        }

        scanner.close();
    }

    // 辅助类，用于存储单词的出现次数和出现的文章编号
    private static class ArticleWordCount {
        int count = 0; // 单词出现次数
        Set<Integer> articles = new HashSet(); // 单词出现的文章编号集合
    }
}