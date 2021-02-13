package lesson3.task_2;

public class CounterTest {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i < 1000; i++) {
                        counter.increaseCounter();
                    }

                }
            });
            thread.start();
        }
        Thread.sleep(1000);//ждем созданные потоки
        System.out.println(counter.getCounter());
    }

}
