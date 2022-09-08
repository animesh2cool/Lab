// Q.3 Can you create object of a class from inside the scope of another class constructor. Yes

class A_perent {
    public void a() {
        System.out.println("this is a super class");
    }
}

class B_child extends A_perent {
    A_perent obj = new A_perent()
}

public class Inherit {
    public static void main(String[] args)
}
