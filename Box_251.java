package Exercise_23;

public class Box_251 {
    private int l,b,h;
    public  void Box(){
        l=b=h=0;
    }
    public  void Box(int s) {
        
        l = b = h = s;
    }
    public  void Box(int i,int j,int k){
            l=i;
            b=j;
            h=k;
        }
        public void show(){
            System.out.println("l="+l+ "b="+b+"h="+h);
        }
    }

