

public class LoaderThread implements Runnable {
    int StartingNumber, LastNumber;
    Listloader A = new ListLoader();
    public LoaderThread() {// default cons
    super();
    }
    public LoaderThread(int startingNumber, int lastNumber) {// parametersied cons
    super();
    this.StartingNumber = startingNumber;
    this.LastNumber = lastNumber;
    }
    @Override
    public void run() {// run method
    long StratTime = System.currentTimeMillis();// getting Starting time
    A.loadList(StartingNumber, LastNumber);
    long lastTime = System.currentTimeMillis();// getting last time
    long responcetime = lastTime - StratTime;// getting responce time
    System.out.println("time taken for Exicution is " + 
    responcetime);
    }
    }
    class MainThread {
    public MainThread() {
    super();
    }
    public static void main(String[] args) {// main method
    LoaderThread T1 = new LoaderThread(0, 5000000);// passing values
    LoaderThread T2 = new LoaderThread(5000000, 10000000);
    T1.run();
    T2.run();
    }
}