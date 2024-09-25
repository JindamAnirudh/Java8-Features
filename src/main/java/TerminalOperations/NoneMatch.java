package TerminalOperations;

import java.util.Arrays;
import java.util.List;

/*NoneMatch is called as Short-Circuit operator because it stops processing as soon as it finds the first
element that does not match the predicate.If it finds such an element it immediately returns false.*/
public class NoneMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        boolean result = numbers.stream().noneMatch(n->n>9);
        System.out.println(result);
    }
}
