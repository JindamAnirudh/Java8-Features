package TerminalOperations;

import java.util.Arrays;
import java.util.List;

/*AllMAtch is called as Short-Circuit operator because it stops processing as soon as it finds the first
element that does not match the predicate.If it finds such an element it immediately returns false.*/
public class AllMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        boolean result = numbers.stream().allMatch(n->n>0);
        System.out.println(result);
    }
}
