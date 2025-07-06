package Exception;

class RunnableDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Chiled Thread Run...");
        }
    }
}
public class MainClass1 {
    public static void main(String[] args) {

        RunnableDemo demo = new RunnableDemo();
        Thread th =new Thread(demo);

        th.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread run...");
        }
    }
}
