package Exercise_23;

public class Emp_29 {
    private int age;
    private String name;
    private int id;
    private static int nextId = 1;
      /*
      static keywords
      there are 3 it can be use it
      1. static data member
      2. static method
      3. static block
      */
    public  Emp_29(int age,String name){
        age = age;
        name = name;
        id = nextId++;

    }
    public void show(){
        System.out.println(id+","+name+","+age);
    }
    public void showNextId()
    {
        System.out.println("Id of the employee will be:"+nextId);
    }
}
