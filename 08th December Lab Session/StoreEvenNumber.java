import java.util.ArrayList;

public class StoreEvenNumber {   // main class
	// created a private ArrayList object
	private ArrayList<Integer> A1 = new ArrayList<Integer>();
    private ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	public ArrayList<Integer> storeEvenNumbers(int n) {    // method 1
		A1 = new ArrayList<Integer>();  // object
		// loop to get even number
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) A1.add(i);   // logic
		}
		return A1;
	}
    public ArrayList<Integer> printEvenNumbers() {    // method 2
		A2 = new ArrayList<Integer>();  // object
		// loop to get even number
		for (int i : A1) {
			A2.add(i*2);
            System.out.println((i*2)+" ");   // logic
		}
		return A2;
	}
	public int retrieveEvenNumber(int n) {   // method 3
		// created a new ArrayList
		ArrayList<Integer> List = new ArrayList<Integer>();    //// object
		// traversing
		for (int item : A1) {
			if (item == n) {
			    System.out.println("Number found "+item);
                return item;}}           // logic
        System.out.println("Number not found "+0); // logic
		return 0;
	}

	public static void main(String[] args) {   // main method
		StoreEvenNumber se = new StoreEvenNumber();    // class object
		se.storeEvenNumbers(10);     // called method 1
        se.printEvenNumbers();         // called method 2
		se.retrieveEvenNumber(4);  // called method 3
	}

}