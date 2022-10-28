//Problem code 1. Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print



import java.lang.Thread;;

public class OddEvenThread {
    public static void main(String[] args) throws InterruptedException{
        Object lock = new Object(); 
        Thread thread1 =  new Thread(new PrintOdd(lock));
        Thread thread2 =  new Thread(new PrintEven(lock));
        thread1.start();
        thread1.join();
        thread2.start();
        }
    }

class PrintEven implements Runnable{
    private Object lock;
    public PrintEven(Object lock) {
        this.lock =  lock;
    }
    
    public void run() {
        synchronized (lock) {
            for (int i = 2; i <= 100; i+=2) {
                System.out.println(i);
                lock.notify();  
            }
        }
      }
    }
    
    
    class PrintOdd implements Runnable {
    private Object lock;
    public PrintOdd(Object lock) {
        this.lock =  lock;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 100; i+=2) {
                System.out.println(i);
                lock.notify();
            }
        }
    }
    }
    
    