package TerminalOperations;

import java.util.Arrays;
import java.util.List;

/*AnyMatch is called as Short-Circuit operator because it stops processing as soon as it finds the first
element that does not match the predicate.If it finds such an element it immediately returns false.*/
public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        boolean result = numbers.stream().anyMatch(n->n>4);
        System.out.println(result);
    }
}
