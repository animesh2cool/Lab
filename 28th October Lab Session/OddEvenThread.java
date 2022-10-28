//Problem code 1. Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print

public class OddEvenThread {
    public static void main(String[] args) throws InterruptedException{
        Object lock = new Object(); 
        Thread thread1 =  new Thread(new PrintOdd(lock));       //creating thread 1
        Thread thread2 =  new Thread(new PrintEven(lock));      //creating thread 2
        thread1.start();                //starting thread 1
        thread1.join();                 //before start thread 2 join with thread 1
        thread2.start();                //starting thread 2
        }
    }

class PrintEven implements Runnable{
    private Object lock;
    public PrintEven(Object lock) {
        this.lock =  lock;
    }
    
    public void run() {                             //overide
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

    public void run() {                                //overide
        synchronized (lock) {
            for (int i = 1; i <= 100; i+=2) {
                System.out.println(i);
                lock.notify();
            }
        }
      }
    }
