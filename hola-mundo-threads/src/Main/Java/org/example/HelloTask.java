package Main.Java.org.example;

import java.util.Scanner;

public class HelloTask implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 50; i++){
            System.out.println("Hi!");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
