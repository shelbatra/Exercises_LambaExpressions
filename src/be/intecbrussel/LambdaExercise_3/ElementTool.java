package be.intecbrussel.LambdaExercise_3;

public class ElementTool {

    static <T> T isbetterElement(T e1, T e2, TwoElemPredicate<T, T> predicate) {
        return predicate.doBusiness(e1, e2) ? e1 : e2;
    }

}

