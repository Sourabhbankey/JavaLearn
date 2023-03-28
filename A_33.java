package Exercise_23;
//Using of Super keywords in java
 class A_33 {
    public A_33(int i){
        System.out.println("In constructor A..."+i);
    }
}
class B extends A_33
{
       public B(){
           super(10);
           System.out.println("In constructor of B...");
       }
}

class UseB{
    public static void main(String[] args) {
        B obj = new B();
    }
}
