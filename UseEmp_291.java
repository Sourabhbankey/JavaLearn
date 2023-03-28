package Exercise_23;

public class UseEmp_291 {
    public static void main(String[] args) {
        Emp_29 e = new Emp_29(21,"sourabh");
        Emp_29 f = new Emp_29(24,"lucky");
        Emp_29 g = new Emp_29(25,"Kratika");

        e.show();
        f.show();
        g.show();
        e.showNextId();
        {
            Emp_29 x = new Emp_29(21, "sourabh");
            Emp_29 y = new Emp_29(22, "ravi");
            x.show();
            y.show();
            x.showNextId();
            x = y = null;
            System.gc();
            System.runFinalization();
        }
            /* finalize there are 3 lines of codes
            to call the garbage collector in java
            finalize work on java Destructor
            object it can be use it for instance variable --> o is small
            Object --> created as a class  --> O is capital
            in Object class is 11 method are present in java class

             */


        e.showNextId();

    }
}
