package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");
        words.stream().forEach(word->System.out.println("Item :"+word));
    }
}
