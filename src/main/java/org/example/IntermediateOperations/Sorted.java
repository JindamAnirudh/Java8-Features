package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Jane","Alex","Bob");
        List<String> result = names.stream().sorted().collect(Collectors.toList());
        //Reverse Order
        //List<String> result = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }
}
