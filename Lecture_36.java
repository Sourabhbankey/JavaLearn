package Exercise_23;

public class Lecture_36 {
    private int rad;
    private final double pi =3.14;

    public void setRadius(int r){
        rad = r;
    }
    public void area(){

        double ar;
      //  ar =++pi*rad*rad;
        ar = pi*rad*rad;
        System.out.println("Area ="+ar);
    }
}
