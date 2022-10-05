package Java.org.example;

public class Acumulator {
    private int value;

    public Acumulator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment (){
        value = value + 1;
    }

    public void decrement (){
        value = value - 1;
    }

}
