package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,5,6,6,7,7,1,4,2,6,8);
        Set<Integer> result = numbers.stream().collect(Collectors.toSet());
        System.out.println(result);//Order will not be same , we can get same order if we use distinct
    }
}
