package Java.org.example;

public class Decrement implements Runnable{
    private final Acumulator acumulator;

    public Decrement(Acumulator acumulator) {
        this.acumulator = acumulator;
    }


    @Override
    public void run() {
        /*for (int i = 100; i < 1000; i++){
            acumulator.decrement();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        while(acumulator.getValue() != 0){
            acumulator.decrement();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
