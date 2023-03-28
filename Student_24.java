package Exercise_23;

public class Student_24 {
    private int roll;
    private String name;
    private double per;

    public  Student_24(){
        System.out.println("Constructor called...");
        roll =10;
        name =new String("Sourabh");
        per = 67.4;

    }

    public void show(){

        System.out.println("roll= "+roll+" name= "+name+" per= "+per);
    }
}
