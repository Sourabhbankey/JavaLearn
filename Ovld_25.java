package Exercise_23;

public class Ovld_25 {
    public  void show(int n){
        System.out.println("Inside show with int args"+n);
    }

        public  void show(char ch){
           System.out.println("Inside show with char args"+ch);
       }



               public  void show(String str){
               System.out.println("Inside show with String args"+str);
           }

                   public void show ( float f){
                   System.out.println("Inside show with float args" + f);
               }

                       public void show ( double dh){
                       System.out.println("Inside show with double args" + dh);
                   }
                   }