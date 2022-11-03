//Thread Activity
//problem 1

import java.util.ArrayList;

public class ListLoader {
    public void loadList(Integer startNumber, Integer lastNumber) {         //method with arguments
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = startNumber; i <= lastNumber; i++) {
            L.add(i);
        }
    }
    public static void main(String[] args) {
        ListLoader obj = new ListLoader();
        long stratTime = System.currentTimeMillis();
        obj.loadList(0, 10000000);      //invoke the loadList
        long lastTime = System.currentTimeMillis();
        long processtime = lastTime - stratTime;               //time taken for the method to run
        System.out.println("Time of Processing the method is " + processtime);
    }
}