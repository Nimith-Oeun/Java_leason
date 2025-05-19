package optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        Optional<String> optionalNullable = Optional.ofNullable(null);
        Optional<String> optionalEmty = Optional.empty();

        System.out.println(optionalValue.get()); //get() method will throw an exception if the value is null
        System.out.println(optionalValue.orElse("Hi"));//orElse() method will return the value if it is not null, otherwise it will return the default value
        System.out.println(optionalNullable.orElse("Free Text"));
        System.out.println(optionalEmty.orElse("Empty Text"));

        System.out.println(optionalValue.isPresent());//isPresent() method will return true if the value is not null
        System.out.println(optionalNullable.isPresent());
        System.out.println(optionalEmty.isPresent());

        boolean isPresent = optionalValue.isPresent();
        optionalValue.ifPresent(System.out::println);//ifPresent() method will print the value if it is not null
        boolean isEmpty = optionalEmty.isEmpty();//isEmpty() method will return true if the value is null

        var value = optionalValue.get();
        var value2 = optionalNullable.orElse("Default Value");
        var value3 = optionalNullable.orElseGet(() -> "Default Value");//orElseGet() method will return the value if it is not null, otherwise it will return the default value
        //   var value4 = optionalNullable.orElseThrow(() -> new IllegalArgumentException("Value is null"));
        //    var value5 = optionalNullable.orElseThrow();

        System.out.println("Value: " + value);
        System.out.println("Value: " + value2);
        System.out.println("Value: " + value3);


        Optional<String> upperCaseValue = optionalValue.map(String::toUpperCase);
        var upperCaseValue2 = optionalValue.map(String::toUpperCase)
                .orElse("No value found");

        Optional<String> flatMappedValue = optionalValue
                .flatMap(nVar -> Optional.of(nVar.toUpperCase()));//flatmap() use for nested optional
        var flatMappedValue2 = optionalValue
                .flatMap(nVar -> Optional.of(nVar.toUpperCase()))
                .orElse("No value found");

        optionalNullable.ifPresentOrElse(s -> System.out.println("Value is presiont " + s)//ifPresentOrElse() method will print the value if it is not null, otherwise it will print the default value
                                        , () -> System.out.println("Value is not present"));

        boolean isPresentt = optionalEmty.isPresent();
        System.out.println("Is present = " + isPresent);

        String str = " ";
        if (null == str) {
            System.out.println("String is null");
        } else {
            System.out.println("String is not null");
        }

        if (null == str || str.isEmpty()) {
            System.out.println("String is null");
        } else {
            System.out.println("String is not null");
        }

        if (null == str || str.isEmpty() || str.isBlank()) {
            System.out.println("String is null");
        } else {
            System.out.println("String is not null");
        }
    }
    }
