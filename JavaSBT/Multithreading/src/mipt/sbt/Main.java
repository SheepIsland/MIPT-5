package mipt.sbt;

public class Main {

    private final Semaphore semaphore = new SemaphoreImpl(3);

    public void run(){
        semaphore.acquire();
        try {
            doBusinessLogic();
        } finally {
            semaphore.release(); //освобождение/закрытие ресурсов всегда в finally!
        }
    }

    private void doBusinessLogic(){
        System.out.println("Hello"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        for (int i=0;i<12;i++){
            Thread t = new Thread(()->{
                main.run();
            });
            t.start();
        }
    }
}
