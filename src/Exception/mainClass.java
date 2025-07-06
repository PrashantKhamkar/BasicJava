package Exception;

import java.security.KeyStore;

class ThreadClass extends Thread{

    //Inbuild run() mehtod provided by Thread class
    @Override
    public void run(){
        while (true){
            System.out.println("Chiled Thread...");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class mainClass {
    public static void main(String[] args) throws InterruptedException {

        ThreadClass threadClass= new ThreadClass();
        //threadClass.setPriority(10);  //we can set priority between 1-10
        threadClass.start(); //start() method to excute run method


        //threadClass.join();//Execute particular thread completely then execute remaining thread

        while (true){
            System.out.println("Main thread ....");
            Thread.sleep(5_000);
        }
    }
}
