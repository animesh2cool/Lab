/*Q2: In this example, you have a base class Teacher and a sub class ITTeacher. 
Since class ITTeacher extends the designation and college properties and work () method from base class, 
we need not to declare these properties and method in sub class. Here we have college Name, 
designation and work () method which are common to all the teachers so we have declared them in the base class, 
this way the child classes like Math Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used
directly from base class.
 */

class Teacher {
    String designation = "Teacher";
    String college = "TICT";
    public void work() {
        System.out.println("Teaching");
    }
}

class ITTeacher extends Teacher {
    public static void main(String args[]) {
        ITTeacher it = new ITTeacher();
        System.out.println(it.college);
        System.out.println(it.designation);
        it.work();
    }
}