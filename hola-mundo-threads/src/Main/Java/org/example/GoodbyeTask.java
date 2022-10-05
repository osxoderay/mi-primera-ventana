package Main.Java.org.example;

public class GoodbyeTask implements Runnable{


    private int times;

    public GoodbyeTask(int times){
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++){
            System.out.println("Sayonara baby");

            try {
                Thread.sleep(20);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
