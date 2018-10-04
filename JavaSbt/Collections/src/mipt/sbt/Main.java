package mipt.sbt;

import apple.laf.JRSUIUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static final String PATH = "/Users/Violetta/Documents/GitHub/MIPT-5/Collections/src/mipt/sbt/input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        reverseOrder();
    }

    /**
     * Подсчитывает количество различных слов в файле
     */
    public static void countWords() throws FileNotFoundException {
        TreeSet<String> words = new TreeSet<>();
        Scanner scanner = new Scanner(new File(PATH));
        while (scanner.hasNext()) {
            String nextWord = scanner.next();
            words.add(nextWord);
        }
        System.out.println("Words count: "+ words.size());
    }

    /**
     * Выведите на экран список различных слов файла,
     отсортированный по возрастанию их длины (компаратор сначала по длине
     слова, потом по тексту).
     */
    public static void differentWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(PATH));
        TreeSet<String> words = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        while (scanner.hasNext()) {
            String nextWord = scanner.next();
            words.add(nextWord);
        }
        for (String word: words) {
            System.out.println(word);
        }

    }

    /**
     * Подсчитывает и выводит на экран сколько раз каждое слово
     встречается в файле.
     */
    public static void countEachWord() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(PATH));
        HashMap<String, Integer> words = new HashMap<>();
        while (scanner.hasNext()){
            String nextWord = scanner.next();
            Integer oldCount = words.get(nextWord);
            if (oldCount == null) {
                oldCount = 0;
            }
            words.put(nextWord, oldCount +1);
        }
        for (String word: words.keySet()) {
            System.out.println(word + ": "+words.get(word));
        }
    }

    /**
     * Выводит на экран все строки файла в обратном порядке.
     */
    public static void reverseOrder() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(PATH));
        ArrayDeque<String> words = new ArrayDeque<>();
        while (scanner.hasNextLine()){
            String nextWord = scanner.nextLine();
            words.add(nextWord);
        }
        Iterator iterator = words.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
