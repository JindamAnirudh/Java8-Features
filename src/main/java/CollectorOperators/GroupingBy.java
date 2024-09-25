package CollectorOperators;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class GroupingBy {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John" , "Newyork"),
                new Person("Jane" , "London"),
                new Person("Jake" , "Newyork")
        );
        // Grouping by city
        Map<String, List<Person>> result = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        // Print the grouped result in a readable format
        result.forEach((city, personList) -> {
            System.out.println(city + ": " +
                    personList.stream()
                            .map(Person::getName)
                            .collect(Collectors.joining(", ")));
        });
    }
}
