import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> setNums = new HashSet<>(List.of(1, 10, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<String> setWords = new HashSet<>(List.of("Green", "Green", "Spring", "Tree",
                "Дерево", "Зеленеет", "Зелёное", "Дерево"));
        System.out.println("Задние 1");
        Task1(nums);
        System.out.println("Задание 2");
        Task2(setNums);
        System.out.println(setNums);
        System.out.println("Задание 3");
        System.out.println(setWords);
        System.out.println("Задание 4");
        Task4(List.of("Green", "Green", "Spring", "Tree", "Дерево", "Зеленеет", "Зелёное", "Дерево"));
    }

    private static void Task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println("num = " + num);
            }
        }
    }

    private static void Task2(Set<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println("num = " + num);
            }
        }
    }

    private static void Task4(List<String> words) {
        Map<String, Integer> uniqueWord = new HashMap<>();
        for (String word : words) {
            if (uniqueWord.containsKey(word)) {
                uniqueWord.put(word, uniqueWord.get(word) + 1);
            } else {
                uniqueWord.put(word, 1);
            }
        }
        System.out.println(uniqueWord);
    }
}