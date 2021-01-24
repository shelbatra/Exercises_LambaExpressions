package be.intecbrussel.LambdaExercise_3;
public class Car {

    public int price;

    Car(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" + "price=" + price + '}';
    }

}

