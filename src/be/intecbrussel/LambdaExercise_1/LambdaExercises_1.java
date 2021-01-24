package be.intecbrussel.LambdaExercise_1;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExercises_1 {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Words", "Strings", "Characters", "Litterals",
                "Paragraph", "Expression", "Comment",
                "Exlamation", "Letters", "Slang", "Language"};

        System.out.println("Shortest to longest: ");
        Arrays.sort(arrayOfStrings, Comparator.comparingInt(String::length));
        //Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
        Arrays.asList(arrayOfStrings).forEach(System.out::println);

        System.out.println("\nLongest to shortest: ");
        Arrays.sort(arrayOfStrings, (s1, s2) -> (s2.length() - s1.length()));
        Arrays.asList(arrayOfStrings).forEach(System.out::println);

        System.out.println("\nAlphabetically by the first character only: ");
        Arrays.sort(arrayOfStrings, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        Arrays.asList(arrayOfStrings).forEach(System.out::println);

        System.out.println("\nStrings that contain “e” first, everything else second: ");
        Arrays.sort(arrayOfStrings, (a1, a2) -> {
            if (a1.contains("e") && a2.contains("e"))
                return 0;
            else if (a1.contains("e"))
                return -1;
            else if (a2.contains("e"))
                return 1;
            return 0;
        });
        Arrays.asList(arrayOfStrings).forEach(System.out::println);
        //Second version
        System.out.println("\nOther version Strings that contain “e” first, \neverything else second but in an expression: ");
        Arrays.sort(arrayOfStrings, (s1, s2) -> {
            String f = "^e";
            return 0;
        });
        Arrays.stream(arrayOfStrings).forEach(System.out::println);
        //  Arrays.sort(array, (s1,s2) -> sortBy(s1) - sortBy(s2));
        //  Arrays.sort(data,(a1, a2) -> getFirstChar(a1) - getFirstChar(a2));


    }
}

        /*public static void sortBy(String str) {
        String[] words = { "Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet" };
        Arrays.sort(words,(a1, a2) ->{
            if(a1.contains("e") && a2.contains("e"))
                return 0;
            else if(a1.contains("e"))
                return -1;
            else if (a2.contains("e"))
                return 1;
            return 0;
        });
    }
}*/