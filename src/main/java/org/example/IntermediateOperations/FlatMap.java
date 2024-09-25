package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(Arrays.asList("one","two"),Arrays.asList("three","four"));
        List<String> result = listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(result);
    }
}
