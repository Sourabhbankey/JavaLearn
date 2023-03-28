package Exercise_23;

public class Emp_291 {
    public class Emp_29 {
        private int age;
        private String name;
        private int id;
        private static int nextId=1;

        public  Emp_29(int a,String n){
            age = a;
            name = n;
            id = nextId++;
        }

        public void show(){

            System.out.println("id"+id+","+name+","+age);
        }
        public static  void showNextId() /*--
        In java just like we have data member we have static data member
        similarly we also have the concept of "static" method
        that is, we can declare method
        1. If a method in a class is a Accessing /Manipulating only "static data member
        2. 
        */
        {
            System.out.println("Id of the employee will be:"+nextId);
        }
        protected void finalize()
        {
            --nextId;
        } // In hava there is a special clas called as Object, available in the package java.lana
         }

}
