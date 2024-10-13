
class MyThread extends Thread {
    private int start;
    private int end;
    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++) {
            System.out.println("Thread " + this.getName() + ": " + i);
        }
    }
}
public class MainClass {
    public static void main(String[] args) {
        int n = 10;
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++){
            threads[i] = new MyThread(i * n, (i + 1) * n);
        }
        for (Thread thread : threads) {
            thread.start();
        }
        try {
            for ( Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test");
    }
}
