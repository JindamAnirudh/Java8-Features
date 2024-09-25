package CollectorOperators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");
        String result = words.stream().collect(Collectors.joining(", "));
        System.out.println(result);

        List<String> words1 = Arrays.asList("apple","banana","cherry");
        String result1 = words1.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println(result1);
    }
}
