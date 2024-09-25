package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,8,3,1,2);
        //MAX
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max);
        List<Integer> numbers1 = Arrays.asList(5,8,3,1,2);
        //MIN
        Optional<Integer> min = numbers1.stream().min(Integer::compareTo);
        System.out.println(min);
    }
}
