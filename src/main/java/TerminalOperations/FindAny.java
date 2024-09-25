package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*FindAny is called as Short-Circuit operator because it stops processing as soon as it finds the first
element that does not match the predicate.Return type should be optional
because if collection is empty then we can avoid null pointer exception.If it does not find any such words
it will return Optional.empty instead of null poiunter exception*/
public class FindAny {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");
        Optional<String> result = words.stream().filter(word->word.startsWith("c")).findAny();
        System.out.println(result);
    }
}
