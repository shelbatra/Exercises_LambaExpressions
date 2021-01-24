package be.intecbrussel.LambdaExercise_2;
import java.util.function.BiPredicate;

public class LambdaApplication {
    public static void main(String[] args) {
        //Better String
        System.out.println("Better String");
        String first="should see me";
        String second="should not see me";

        System.out.println(StringTool.isBetterString(second, first, (a1, a2)-> true));
        System.out.println(StringTool.isBetterString(second, first, (a1, a2)-> false));
        System.out.println(StringTool.isBetterString(first, second, (a1, a2)->true));
        System.out.println(StringTool.isBetterString(first, second, (a1, a2)->false));

    }
}
