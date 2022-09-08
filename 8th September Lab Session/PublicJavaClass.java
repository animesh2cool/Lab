/* Q.3... Develop a public java class and make sure nobody can create 
any object of this class from outside the class */

class Java {
    private void NBCO()
}

public class PublicJavaClass {
    public static void main(String[] args) {
        Java obj = new Java();
    }
}