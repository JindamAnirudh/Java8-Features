package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");
        List<String> result = words.stream()
                .peek(word-> System.out.println("Original : "+word))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
