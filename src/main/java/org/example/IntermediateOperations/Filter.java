package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,6,7,8,1,9);
        List<Integer> result = numbers.stream().filter(n->n>5).collect(Collectors.toList());
        System.out.println(result);
        }
}