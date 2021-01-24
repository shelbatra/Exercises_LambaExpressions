package be.intecbrussel.LambdaExercise_3;

public class LambdasExercises_3 {
    /**
     * Making generically-typed interfaces for which lambdas can be used. Use generics to replace
     * your String-specific solutions to problem 3 with generically typed solutions. That is, replace
     * betterString with betterEntry and TwoStringPredicate with TwoElementPredicate. Make sure your
     * previous examples still work when you only change betterString(Stringtool) to betterElement(ElementTool).
     * But, now you should also be able to supply two Cars and a Car predicate, two Employees and an Employee
     * predicate, etc. For example:
     * • ElementUtils.betterElement(string1, string2, (s1, s2) -> s1.length() > s2.length())
     * • ElementUtils.betterElement(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice())
     * • ElementUtils.betterElement(employee1, employee2, (e1, e2) -> e1.getSalary() > e2.getSalary())
     */

    public static void main(String[] args) {
        final String string1 = "aaaa";
        final String string2 = "bb";

        System.out.println("Better string: " +
                ElementTool.isbetterElement(string1, string2, (s1, s2) ->
                        s1.length() > s2.length()));
        System.out.println("Better car: " +
                ElementTool.isbetterElement(new Car(1), new Car(2), (c1, c2) ->
                        c1.getPrice() > c2.getPrice()));
        System.out.println("Better employee: " +
                ElementTool.isbetterElement(new Employee(10), new Employee(15), (e1, e2) ->
                        e1.getSalary() > e2.getSalary()));
    }
}

