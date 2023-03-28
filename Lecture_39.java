package Exercise_23;

interface Lecture_39 {
    //Figure
    String getName();
    double getArea();
}

class Circle implements Lecture_39
{
    private double rad;
    public Circle(int i)
    {
        this.rad = rad;
    }
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(rad,2);
    }
}
 class Rectangle implements Lecture_39{
       private  int l,b;

       public Rectangle(int l,int b){
           this.l=l;
           this.b=b;
       }

     public Rectangle(double v) {
     }

     @Override
     public String getName() {
         return "Rectangle";
     }

     @Override
     public double getArea() {
         return l*b;
     }
 }