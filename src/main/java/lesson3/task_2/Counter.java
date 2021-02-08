package lesson3.task_2;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public void increaseCounter(){

        try {
            lock.lock();
            counter++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public int getCounter(){
        return counter;
    }
}
