package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,3,1,6,8,2,3,7,2,6,5);
        List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
