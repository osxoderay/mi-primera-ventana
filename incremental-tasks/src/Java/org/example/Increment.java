package Java.org.example;

public class Increment implements Runnable{
    private final Acumulator acumulator;

    public Increment(Acumulator acumulator) {
        this.acumulator = acumulator;
    }



    @Override
    public void run() {
       /* for (int i = 100; i < 1000; i++){ // no hay que hacerlo con for, mejor con while en este caso
            acumulator.increment();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        while(acumulator.getValue() != 0){
            acumulator.increment();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
