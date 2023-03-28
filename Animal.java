package Exercise_23;

interface Animal {
     void run();
}
interface Reptile{
    void swim();
}

class Crocodile implements Animal, Reptile {
    public void run(){
        System.out.println("Croc running....");
}
public  void swim()
{
    System.out.println("Croc Swimming...");
}
}

class UseCroc
{
    public static void main(String[] args) {
        Crocodile obj = new Crocodile();
        obj.run();
        obj.swim();
    }
}
